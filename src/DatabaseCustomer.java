import java.util.ArrayList;
/**
 * This is class DatabaseCustomer.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 5/3/20
 */
public class DatabaseCustomer //Create the class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    //private static String[] listCustomer;
    private static ArrayList<Customer> CUSTOMER_DATABASE =  new ArrayList<Customer>();
    private static int LastId = 0;

    public DatabaseCustomer()
    {

    }

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    public static int getLastId()
    {
        return LastId;
    }

    public static Customer getCustomerById(int id)
    {
        Customer returnValue = null;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId() == id)
            {
                returnValue = customerDB;
            }
        }
        return returnValue;
    }

    public static boolean addCustomer(Customer customer)
    {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getName().equals(customerDB.getName()) &&
                    customer.getEmail().equals(customerDB.getEmail()))
            {
                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LastId = customer.getId();
        return true;

    }

    public static boolean removeCustomer(int id)
    {
        boolean returnValue = false;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId() == id)
            {
                CUSTOMER_DATABASE.remove(id);
                returnValue = true;
            }
        }
        return returnValue;
    }

}