import java.util.ArrayList;
import java.lang.reflect.Array;
import java.time.*;
import java.text.*;
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
    private static int lastId = 0;

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }

    public static Customer getCustomerById(int id){
        for (Customer customer : CUSTOMER_DATABASE) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public static boolean addCustomer(Customer customer){
        for(Customer customers : CUSTOMER_DATABASE){
            if (customers.getEmail().equals(customer.getEmail())) {
                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId();
        return true;
    }

    public static boolean removeCustomer(int id){
        for(int i = 0; i < CUSTOMER_DATABASE.size(); i++){
            Customer customer = CUSTOMER_DATABASE.get(i);
            if (customer.getId() == id){
                CUSTOMER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }

}