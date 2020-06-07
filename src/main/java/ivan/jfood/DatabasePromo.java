package ivan.jfood;
import java.util.ArrayList;

/**
 * This is a description of the class DatabasePromo.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/20
 */
public class DatabasePromo
{
    // instance variables - replace the example below with your own
    //private String[] listPromo;

    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<Promo>();
    private static int lastId = 0;

    /**
     * Constructor for objects of class DatabaseSeller
     */

    /**
     * Get promo database
     * @return PROMO_DATABASE
     */
    public static ArrayList<Promo> getPromoDatabase()
    {
        return PROMO_DATABASE;
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
     * Get promo by id.
     * @param id id
     * @return promo
     * @throws PromoNotFoundException the promo not found exception
     */
    public static Promo getPromoById(int id) throws PromoNotFoundException
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if (promo.getId() == id)
            {
                return promo;
            }
        }
        throw new PromoNotFoundException(id);
    }

    /**
     * Get promo by code.
     * @param code code
     * @return promo
     */
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

    /**
     * Add promo boolean.
     * @param promo the id
     * @return boolean
     * @throws PromoCodeAlreadyExistsException promo code already exist exception
     */
    public static boolean addPromo(Promo promo) throws PromoCodeAlreadyExistsException
    {
        for (Promo _promo : PROMO_DATABASE) {
            if (_promo.getCode().equals(promo.getCode())){
                throw new PromoCodeAlreadyExistsException(promo);
            }
        }
        PROMO_DATABASE.add(promo);
        lastId = promo.getId();
        return true;
    }

    /**
     * Remove promo boolean.
     * @param id id
     * @return boolean
     * @throws PromoNotFoundException the promo not found exception
     */
    public static boolean removePromo(int id) throws PromoNotFoundException
    {
        for(Promo promo : PROMO_DATABASE) {
            if(promo.getId() == id) {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        throw new PromoNotFoundException(id);
    }

    /**
     * Activated promo boolean.
     * @param id the id
     * @return boolean
     */
    public static boolean activatePromo(int id)
    {
        for(Promo promo: PROMO_DATABASE)
        {
            if(promo.getId() == id)
            {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }

    /**
     * Deactivated promo boolean.
     * @param id the id
     * @return boolean
     */
    public static boolean deactivatePromo(int id)
    {
        for (Promo promo : PROMO_DATABASE) {
            if (promo.getId() == id) {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        return false;
    }
}