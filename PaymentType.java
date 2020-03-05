/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum PaymentType
{
    CASHLESS("Cashless"),
    CASH("Cash");
    
    private String type;
    private PaymentType(String type)
    {
        this.type = type;
    }
    public String toString()
    {
        return this.type;
    }
}
        

    
