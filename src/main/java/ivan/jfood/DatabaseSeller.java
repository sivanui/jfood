package ivan.jfood;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.time.*;
import java.text.*;
/**
 * Write a description of class DatabaseSeller here.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 2/4/20
 */
public class DatabaseSeller
{
    private static int lastId = 0;
    private static ArrayList<Seller> SELLER_DATABASE=new ArrayList<Seller>();
    public static ArrayList<Seller> getSellerDatabase()
    {
        return SELLER_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }
    public static Seller getSellerById(int id) throws SellerNotFoundException
    {
        for(Seller seller : SELLER_DATABASE)
        {
            if (seller.getId() == id)
            {
                return seller;
            }
        }
        throw new SellerNotFoundException(id);
    }
    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastId = seller.getId();
        return true;
    }
    public static boolean removeSeller(int id) throws SellerNotFoundException
    {
        for(Seller sell : SELLER_DATABASE){
            if(sell.getId()==id){
                SELLER_DATABASE.remove(sell);
                return true;
            }
        }
        throw new SellerNotFoundException(id);
    }
}
