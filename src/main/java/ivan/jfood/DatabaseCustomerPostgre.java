package ivan.jfood;
import java.sql.*;
import java.util.ArrayList;

/**
 * class DatabaseCustomerPostgre
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class DatabaseCustomerPostgre extends DatabaseConnectionPostgre
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();

    /**
     * Get customer database
     * @return CUSTOMER_DATABASE
     */
    public static ArrayList<Customer> getDatabaseCustomer()
    {
        Connection connection = connection();
        PreparedStatement preparedStatement;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        Customer customer = null;
        try
        {
            String sql = "SELECT * FROM customer;";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                id = resultSet.getInt("id");
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                password = resultSet.getString("password");
                customer = new Customer(id, name, email, password);
                CUSTOMER_DATABASE.add(customer);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return CUSTOMER_DATABASE;
    }

    /**
     * Insert customer
     * @param name name
     * @param email email
     * @param password password
     * @return customer
     */
    public static Customer insertCustomer(String name, String email, String password)
    {
        Connection connection = connection();
        PreparedStatement preparedStatement;
        Customer customer = null;
        try
        {
            String sql = "INSERT INTO customer (name, email, password) VALUES (?,?,?) RETURNING id;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            int id = 1;
            while (resultSet.next())
            {
                id = resultSet.getInt(1);
            }
            customer = new Customer(id, name, email, password);
            preparedStatement.close();
            connection.close();
            return customer;
        } catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return customer;
    }

    /**
     * Get last customer
     * @return customer
     */
    public static int getLastCustomerId()
    {
        Connection connection = connection();
        PreparedStatement preparedStatement;
        int id = 0;
        try
        {
            String sql = "SELECT id FROM customer;";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                id = resultSet.getInt(1);
            }
            preparedStatement.close();
            connection.close();
            return id;
        } catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return id;
    }

    /**
     * Get customer by id
     * @param id_cust customer id
     * @return customer
     */
    public static Customer getCustomer(int id_cust)
    {
        Connection connection = connection();
        PreparedStatement preparedStatement;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        Customer customer = null;
        try
        {
            String sql = "SELECT * FROM customer WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id_cust);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                id = resultSet.getInt("id");
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                password = resultSet.getString("password");
            }
            preparedStatement.close();
            connection.close();
            customer = new Customer(id, name, email, password);
        } catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return customer;
    }

    /**
     * Get customer
     * @param email_cust customer emial
     * @param password_cust customer password
     * @return customer
     */
    public static Customer getCustomer(String email_cust, String password_cust)
    {
        Connection connection = connection();
        PreparedStatement preparedStatement;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        Customer customer = null;
        try
        {
            String sql = "SELECT id, name, email, password, joindate FROM customer WHERE email=? AND password=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email_cust);
            preparedStatement.setString(2, password_cust);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next())
            {
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                password = rs.getString("password");
            }
            preparedStatement.close();
            connection.close();
            customer = new Customer(id, name, email, password);
            return customer;
        } catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return customer;
    }

    /**
     * Remove customer boolean.
     * @param id the id
     * @return the boolean
     */
    public static boolean removeCustomer(int id)
    {
        Connection connection = connection();
        PreparedStatement preparedStatement;
        try
        {
            String sql = "DELETE FROM customer WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
            return true;
        } catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return false;
    }
}