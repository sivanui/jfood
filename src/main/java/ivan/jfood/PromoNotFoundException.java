package ivan.jfood;

/**
 * class PromoNotFoundException
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class PromoNotFoundException extends Exception {
    private int promo_error;

    /**
     * Constructor for objects of class PromoNotFoundException
     * @param promo_input promo input
     */
    public PromoNotFoundException(int promo_input){
        super("Promo ID : ");
        this.promo_error = promo_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + promo_error + " not found.";
    }
}