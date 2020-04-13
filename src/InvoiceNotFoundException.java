public class InvoiceNotFoundException extends Exception {
    private int invoice_error;

    public InvoiceNotFoundException(int invoice_input){
        super("Invoice ID : ");
        this.invoice_error = invoice_input;
    }

    public String getMessage()
    {
        return super.getMessage() + invoice_error + " not found.";
    }
}