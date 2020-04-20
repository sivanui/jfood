package ivan.jfood;
import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    /**
     * Constructor for objects of class DatabaseSeller
     */

    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                return invoice;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId)
    {
        ArrayList<Invoice> invoiceList = new ArrayList<>();
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getCustomer().getId() == customerId){
                invoiceList.add(invoice);
            }
        }
        return invoiceList;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException
    {
        int customerId = invoice.getCustomer().getId();
        for (Invoice invoiceAdd : INVOICE_DATABASE) {
            if (invoiceAdd.getCustomer().getId() == customerId && invoiceAdd.getInvoiceStatus() == InvoiceStatus.ONGOING){
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for(Invoice invoice : INVOICE_DATABASE) {
            if(invoice.getId() == id && invoice.getInvoiceStatus().equals(InvoiceStatus.ONGOING)) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}