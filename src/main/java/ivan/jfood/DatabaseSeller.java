package ivan.jfood;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.time.*;
import java.text.*;
/**
 * This is a description of the class DatabaseSeller.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/20
 */
public class DatabaseSeller
{
    private static int lastId = 0;
    private static ArrayList<Seller> SELLER_DATABASE=new ArrayList<Seller>();

    /**
     * Get seller database
     * @return SELLER_DATABASE
     */
    public static ArrayList<Seller> getSellerDatabase()
    {
        return SELLER_DATABASE;
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
     * Get seller by id.
     * @param id id
     * @return seller
     * @throws SellerNotFoundException the seller not found exception
     */
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

    /**
     * Add seller boolean.
     * @param seller the id
     * @return boolean
     */
    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastId = seller.getId();
        return true;
    }

    /**
     * Remove seller boolean.
     * @param id id
     * @return boolean
     * @throws SellerNotFoundException the seller not found exception
     */
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
