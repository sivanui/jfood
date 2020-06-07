package ivan.jfood;

/**
 * class OngoingInvoiceAlreadyExistsException
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class OngoingInvoiceAlreadyExistsException extends Exception
{
    private Invoice invoice_error;

    /**
     * Constructor for objects of class OngoingInvoiceAlreadyExistsException
     * @param invoice_input invoice input
     */
    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input)
    {
        super("Ongoing Invoice : ");
        invoice_error = invoice_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists.";
    }
}