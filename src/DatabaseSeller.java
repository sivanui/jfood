import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * Write a description of class DatabaseSeller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseSeller
{
    private static int lastId;
    private static ArrayList<Seller> SELLER_DATABASE=new ArrayList<Seller>();
    public static ArrayList<Seller> getSellerDatabase()
    {
        return SELLER_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }
    public static Seller getSellerById(int id)
    {
        for(Seller seller : SELLER_DATABASE)
        {
            if (seller.getId() == id)
            {
                return seller;
            }
        }
        return null;
    }
    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastId = seller.getId();
        return true;
    }
    public static boolean removeSeller(int id)
    {
        for(Seller seller : SELLER_DATABASE) {
            if(seller.getId() == id) {
                SELLER_DATABASE.remove(seller);
                return true;
            }
        }
        return false;
    }
}
