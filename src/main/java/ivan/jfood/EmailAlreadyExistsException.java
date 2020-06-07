package ivan.jfood;

/**
 * class EmailAlreadyExistsException
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class EmailAlreadyExistsException extends Exception
{
    private Customer customer_error;

    /**
     * Constructor for objects of class EmailAlreadyExistsExceptionn
     * @param customer_input customer input
     */
    public EmailAlreadyExistsException(Customer customer_input)
    {
        super("Customer Email : ");
        customer_error = customer_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + customer_error.getEmail() + " already exists.";
    }
}