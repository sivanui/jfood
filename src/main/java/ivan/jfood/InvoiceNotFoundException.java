package ivan.jfood;

/**
 * class InvoiceNotFoundException
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class InvoiceNotFoundException extends Exception {
    private int invoice_error;

    /**
     * Constructor for objects of class InvoiceNotFoundException
     * @param invoice_input invoice input
     */
    public InvoiceNotFoundException(int invoice_input){
        super("Invoice ID : ");
        this.invoice_error = invoice_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + invoice_error + " not found.";
    }
}