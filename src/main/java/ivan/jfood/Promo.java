package ivan.jfood;
/**
 * This is class Promo.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/20
 */
public class Promo //Create the class Promo
{
   private int id;
   private String code;
   private int discount;
   private int minPrice;
   private boolean active;

    /**
     * Constructor for objects of class Promo
     * @param id promo's id
     * @param code promo's code
     * @param discount promo's discount
     * @param minPrice promo's minPrice
     * @param active promo's status
     */
   public Promo(int id, String code, int discount, int minPrice,
   boolean active)
   {
      this.id = id;
      this.code = code;
      this.discount = discount;
      this.minPrice = minPrice;
      this.active = active;
   }

    /**
     * Get id
     * @return id
     */
   public int getId()
   {
       return id;
   }

    /**
     * Get code
     * @return code
     */
   public String getCode()
   {
       return code;
   }

    /**
     * Get discount
     * @return discount
     */
   public int getDiscount()
   {
       return discount;
   }

    /**
     * Get min price
     * @return minPrice
     */
   public int getMinPrice()
   {
       return minPrice;
   }

    /**
     * Get active
     * @return active
     */
   public boolean getActive()
   {
       return active;
   }

    /**
     * Set id
     * @param id id
     */
   public void setId(int id)
   {
       this.id = id;
   }

    /**
     * Set code
     * @param code code
     */
   public void Code(String code)
   {
       this.code = code;
   }

    /**
     * Set code
     * @param discount discount
     */
   public void setDiscount(int discount)
   {
       this.discount = discount;
   }

    /**
     * Set min price
     * @param minPrice min price
     */
   public void setMinPrice(int minPrice)
   {
       this.minPrice = minPrice;
   }

    /**
     * Set status
     * @param active status
     */
   public void setActive(boolean active)
   {
       this.active = active;
   }

    /**
     * Method toString
     */
   public String toString()
   {
        return String.format("Id=" + getId() + "\n" +
                "Code=" + getCode() + "\n" +
                "Discount=" + getDiscount() + "\n" +
                "MinPrice=" + getMinPrice() + "\n" +
                "Status=" + getActive());
    }

}
