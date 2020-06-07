package ivan.jfood;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * class DatabaseConnectionPostgre
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/2020
 */
public class DatabaseConnectionPostgre
{
    protected static Connection connection()
    {
        Connection connection = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jfood", "postgres", "123");
        } catch (Exception exception)
        {
            exception.printStackTrace();
            System.out.println(exception.getClass().getName() + ": " + exception.getMessage());
            System.exit(0);
        }
        return connection;
    }
}

