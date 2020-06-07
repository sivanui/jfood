package ivan.jfood;

/**
 * class CustomerNotFoundException
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class FoodNotFoundException extends Exception {
    private int food_error;

    /**
     * Constructor for objects of class CustomerNotFoundException
     * @param food_input food input
     */
    public FoodNotFoundException(int food_input){
        super("Food ID : ");
        this.food_error = food_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + food_error + " not found.";
    }
}