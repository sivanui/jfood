/**
 * This is class Promo.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 12/3/20
 */
public class Promo //Create the class Promo
{
   private int id;
   private String code;
   private int discount;
   private int minPrice;
   private boolean active;

   public Promo(int id, String code, int discount, int minPrice,
   boolean active)
   {
      this.id = id;
      this.code = code;
      this.discount = discount;
      this.minPrice = minPrice;
      this.active = active;
   }
   public int getId()
   {
       return id;
   }
   public String getCode()
   {
       return code;
   }
   public int getDiscount()
   {
       return discount;
   }
   public int getMinPrice()
   {
       return minPrice;
   }
   public boolean getActive()
   {
       return active;
   }
   public void setId(int id)
   {
       this.id = id;
   }
   public void Code(String code)
   {
       this.code = code;
   }
   public void setDiscount(int discount)
   {
       this.discount = discount;
   }
   public void setMinPrice(int minPrice)
   {
       this.minPrice = minPrice;
   }
   public void setActive(boolean active)
   {
       this.active = active;
   }
    public String toString(){
        return String.format("Id=" + getId() + "\n" +
                "Code=" + getCode() + "\n" +
                "Discount=" + getDiscount() + "\n" +
                "MinPrice=" + getMinPrice() + "\n" +
                "Status=" + getActive());
    }

}
