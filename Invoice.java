/**
 * This is class Invoice.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 27/2/20
 */
public abstract class Invoice //Create the class Invoice
{
  /* Below is used to
   * declare the variables
   * of the Invoice
   */
  private int id;
  private Food food;
  private String date;
  protected int totalPrice;
  private Customer customer;
  private InvoiceStatus invoiceStatus;
  public Invoice(int id, Food food, String date, Customer customer,
  InvoiceStatus invoiceStatus)
  {
     this.id = id;
     this.food = food;
     this.date = date;
     this.customer = customer;
     this.invoiceStatus = invoiceStatus;
  }
  public int getId()
  {
       return id;
  }
  public Food getFood()
  {
     return food;
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
  public abstract PaymentType getPaymentType();
  public InvoiceStatus getInvoiceStatus()
  {
      return invoiceStatus;
  }
  public void setId(int id)
  {
      this.id = id;
  }
  public void setFood(Food food)
  {
      this.food = food;
  }
  public void setDate(String date)
  {
      this.date = date;
  }
  public abstract void setTotalPrice();
  public void setCustomer(Customer customer)
  {
      this.customer = customer;
  }
  public void setInvoiceStatus(InvoiceStatus status)
  {
      this.invoiceStatus = invoiceStatus;
  }
  public abstract void printData();
}
