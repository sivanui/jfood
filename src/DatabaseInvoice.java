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

    public static Invoice getInvoiceById(int id)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId)
    {
        ArrayList<Invoice> listCust = new ArrayList<Invoice>();
        for(Invoice invoice: INVOICE_DATABASE)
        {
            if(invoice.getCustomer().getId() == customerId)
            {
                listCust.add(invoice);
                return listCust;
            }
        }
        return null;
    }

    public static boolean addInvoice(Invoice invoice)
    {
        for(Invoice invoiceDB: INVOICE_DATABASE)
        {
            if(invoiceDB.getInvoiceStatus().equals(invoice.getInvoiceStatus().ONGOING))
            {
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for(Invoice invoiceDB: INVOICE_DATABASE){
            if(invoiceDB.getInvoiceStatus() == InvoiceStatus.ONGOING && invoiceDB.getId() == id){
                invoiceDB.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        return false;
    }
}
