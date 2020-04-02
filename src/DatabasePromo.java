import java.util.ArrayList;
import java.lang.reflect.Array;
public class DatabasePromo
{
    private static ArrayList<Promo> PROMO_DATABASE;
    private static int lastId;
    /**
     * Constructor for objects of class DatabaseSeller
     */
    public static ArrayList<Promo> getPromoDatabase()
    {
        return PROMO_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }
    public static Promo getPromoById(int id)
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if (promo.getId() == id)
            {
                return promo;
            }
        }
        return null;
    }
    public static Promo getPromoByCode(String code)
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if (promo.getCode() == code)
            {
                return promo;
            }
        }
        return null;
    }
    public static boolean activatePromo(int id) {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            promo.setActive(true);
            return true;
        }
        return false;
    }

    public static boolean deactivatePromo(int id) {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            promo.setActive(false);
            return true;
        }
        return false;
    }
    public static boolean addPromo(Promo promo)
    {
        PROMO_DATABASE.add(promo);
        lastId = promo.getId();
        return true;
    }

    public static boolean removePromo(int id)
    {
        for(Promo promo : PROMO_DATABASE) {
            if(promo.getId() == id) {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        return false;
    }
}