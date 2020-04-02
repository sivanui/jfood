import java.util.ArrayList;

/**
 * This is class Food.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 27/2/20
 */
public class Food extends ArrayList<Food> //Create the class Food
{
  /* Below is used to
   * declare the variables
   * of the Food
   */
  private int id;
  private String name;
  private Seller seller;
  private int price;
  private FoodCategory category;
  public Food(int id, String name, Seller seller, int price, FoodCategory category)
  {
     this.id = id;
     this.name = name;
     this.seller = seller;
     this.price = price;
     this.category = category;
  }
  public int getId()
  {
     return id;
  }
  public String getName()
  {
     return name;
  }
  public Seller getSeller()
  {
     return seller;
  }
  public int getPrice()
  {
     return price;
  }
  public FoodCategory getCategory()
  {
     return category;
  }
  public void setId(int id)
  {
      this.id = id;
  }
  public void setName(String name)
  {
      this.name = name;
  }
  public void setSeller(Seller seller)
  {
      this.seller = seller;
  }
  public void setPrice(int price)
  {
      this.price = price;
  }
  public void setCategory(FoodCategory category)
  {
      this.category = category;
  }
  public String toString()
    {
        return id+""+name+""+seller.getName()+""+seller.getLocation().getCity()+""+price+""+category;
    }
  //public void printData()
  //{
  //    System.out.println("=======FOOD=======");
  //    System.out.println("ID: "+id);
  //    System.out.println("Name: "+name);
  //    System.out.println("Seller: "+seller.getName());
  //    System.out.println("City: "+seller.getLocation().getCity());
  //    System.out.println("Price: " +price);
  //    System.out.println("Category: "+category);
  //}
}
