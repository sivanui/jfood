package ivan.jfood;

/**
 * class CustomerNotFoundException
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class SellerNotFoundException extends Exception {
    private int seller_error;

    /**
     * Constructor for objects of class SellerNotFoundException
     * @param seller_input customer input
     */
    public SellerNotFoundException(int seller_input){
        super("Seller ID : ");
        this.seller_error = seller_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + seller_error + " not found.";
    }
}