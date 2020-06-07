package ivan.jfood;
/**
 * Enumeration class PaymentType
 *
 * @author Sulaiman Ivan Achmadi
 * @version 06/07/2020
 */
public enum PaymentType
{
    CASHLESS("Cashless"),
    CASH("Cash");
    
    private String paymentType;

    /**
     * Constructor for objects of class PaymentType
     * @param paymentType payment type
     */
    private PaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }

    /**
     * Method toString
     */
    public String toString()
    {
        return this.paymentType;
    }
}
        

    
