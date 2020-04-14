package ivan.jfood;
public class PromoNotFoundException extends Exception {
    private int promo_error;

    public PromoNotFoundException(int promo_input){
        super("Promo ID : ");
        this.promo_error = promo_input;
    }

    public String getMessage()
    {
        return super.getMessage() + promo_error + " not found.";
    }
}