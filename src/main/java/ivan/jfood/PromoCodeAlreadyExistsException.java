package ivan.jfood;

/**
 * class PromoCodeAlreadyExistsException
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class PromoCodeAlreadyExistsException extends Exception
{
    private Promo promo_error;

    /**
     * Constructor for objects of class PromoCodeAlreadyExistsException
     * @param promo_input promo input
     */
    public PromoCodeAlreadyExistsException(Promo promo_input)
    {
        super("Promo Code : ");
        promo_error = promo_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + promo_error.getCode() + " already exists.";
    }
}