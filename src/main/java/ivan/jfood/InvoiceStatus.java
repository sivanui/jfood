package ivan.jfood;
/**
 * Enumeration class InvoiceStatus
 *
 * @author Sulaiman Ivan Acmadi
 * @version 06/07/2020
 */
public enum InvoiceStatus
{
    Ongoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Cancelled"),
    Hold("Hold");
    
    private String status;

    /**
     * Constructor for objects of class InvoiceStatus
     * @param status status
     */
    private InvoiceStatus(String status)
    {
        this.status = status;
    }

    /**
     * Method toString
     */
    public String toString()
    {
        return this.status;
    }
}
        

    
