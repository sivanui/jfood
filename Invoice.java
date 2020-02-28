/**
 * This is class Invoice.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 27/2/20
 */
public class Invoice //Create the class Invoice
{
  /* Below is used to
   * declare the variables
   * of the Invoice
   */
  private int id;
  private int idFood;
  private String date;
  private int totalPrice;
  private Customer customer;
  public Invoice(int id, int idFood, String date, Customer customer, int totalPrice)
  {
      this.id = id;
      this.idFood = idFood;
      this.date = date;
      this.totalPrice = totalPrice;
      this.customer = customer;
  }
  public int getId()
  {
       return id;
  }
  public int getIdFood()
  {
       return idFood;
  }
  public String getDate()
  {
       return date;
  }
  public int getTotalPrice()
  {
       return totalPrice;
  }
  public Customer getCustomer()
  {
       return customer;
  }
  public void setId(int id)
  {
      this.id = id;
  }
  public void setIdFood(int idFood)
  {
      this.idFood = idFood;
  }
  public void setDate(String date)
  {
      this.date = date;
  }
  public void setTotalPrice(int totalPrice)
  {
      this.totalPrice = totalPrice;
  }
  public void setCustomer(Customer customer)
  {
      this.customer = customer;
  }
  public void printData()
  {
      System.out.println(totalPrice);
  }
}
