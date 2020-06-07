package ivan.jfood;

/**
 * class CustomerNotFoundException
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */

public class CustomerNotFoundException extends Exception {
    private int customer_error;

    /**
     * Constructor for objects of class CustomerNotFoundException
     * @param customer_input customer input
     */
    public CustomerNotFoundException(int customer_input){
        super("Customer ID : ");
        this.customer_error = customer_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + customer_error + " not found.";
    }
}