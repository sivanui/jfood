package ivan.jfood;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.time.*;
import java.text.*;
import java.util.ArrayList;
/**
 * This is class DatabaseCustomer.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/20
 */
public class DatabaseCustomer //Create the class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    //private static String[] listCustomer;

    private static ArrayList<Customer> CUSTOMER_DATABASE =  new ArrayList<Customer>();
    private static int lastId = 0;

    /**
     * Get customer database
     * @return CUSTOMER_DATABASE
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    /**
     * Get last id
     * @return lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Get customer by id.
     * @param id the id
     * @return customer
     * @throws CustomerNotFoundException the customer not found exception
     */
    public static Customer getCustomerById(int id) throws CustomerNotFoundException {

        for (Customer customer : CUSTOMER_DATABASE) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    /**
     * Add customer boolean.
     * @param customer the id
     * @return the boolean
     * @throws EmailAlreadyExistsException the customer not found exception
     */
    public static boolean addCustomer(Customer customer) throws EmailAlreadyExistsException
    {
        for(Customer customers : CUSTOMER_DATABASE){
            if (customers.getEmail().equals(customer.getEmail())) {
                throw new EmailAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId();
        return true;
    }

    /**
     * Remove customer boolean.
     * @param id the id
     * @return the boolean
     * @throws CustomerNotFoundException the customer not found exception
     */
    public static boolean removeCustomer(int id) throws CustomerNotFoundException
    {
        for(int i = 0; i < CUSTOMER_DATABASE.size(); i++){
            Customer customer = CUSTOMER_DATABASE.get(i);
            if (customer.getId() == id){
                CUSTOMER_DATABASE.remove(i);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    /**
     * Get customer login.
     * @param email email
     * @param password password
     * @return customer
     */
    public static Customer getCustomerLogin(String email, String password)
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if (customer.getEmail().equals(customer.getEmail()) && customer.getPassword().equals(customer.getPassword()))
            {
                return customer;
            }
        }
        return null;
    }
}