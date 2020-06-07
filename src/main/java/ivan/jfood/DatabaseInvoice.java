package ivan.jfood;
import java.util.ArrayList;

/**
 * class DatabaseInvoice
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    /**
     * Constructor for objects of class DatabaseSeller
     */

    /**
     * Get invoice database
     * @return INVOICE_DATABASE
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }

    /**
     * Get last id
     * @return lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Get invoice by id.
     * @param id id
     * @return invoice
     */
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

    /**
     * Get invoice by customer.
     * @param customerId customer id
     * @return list
     */
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

    /**
     * Add invoice boolean.
     * @param invoice invoice
     * @return boolean
     * @throws OngoingInvoiceAlreadyExistsException exceptions
     */
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException
    {
        int customerId = invoice.getCustomer().getId();
        for (Invoice invoiceAdd : INVOICE_DATABASE) {
            if (invoiceAdd.getCustomer().getId() == customerId && invoiceAdd.getInvoiceStatus() == InvoiceStatus.Ongoing){
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    /**
     * Change invoice status.
     * @param id the id
     * @param invoiceStatus status
     * @return boolean
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for(Invoice invoice : INVOICE_DATABASE) {
            if(invoice.getId() == id && invoice.getInvoiceStatus().equals(InvoiceStatus.Ongoing)) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    /**
     * Remove invoice boolean.
     * @param id id
     * @return boolean
     * @throws InvoiceNotFoundException the invoice not found exception
     */
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
