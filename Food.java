/**
 * This is class Food.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 27/2/20
 */
public class Food //Create the class Food
{
  /* Below is used to
   * declare the variables
   * of the Food
   */
  private int id;
  private String name;
  private Seller seller;
  private int price;
  private String category;
  public Food(int id, String name, Seller seller, int price, String category)
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
  public String getCategory()
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
  public void setCategory(String category)
  {
      this.category = category;
  }
  public void printData()
  {
      System.out.println(name);
  }
}
