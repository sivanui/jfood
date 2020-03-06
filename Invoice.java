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
  private PaymentType paymentType;
  private InvoiceStatus status;
  public Invoice(int id, int idFood, String date, int totalPrice, Customer customer, PaymentType paymentType, InvoiceStatus status)
  {
      this.id = id;
      this.idFood = idFood;
      this.date = date;
      this.totalPrice = totalPrice;
      this.customer = customer;
      this.paymentType = paymentType;
      this.status = status;
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
  public PaymentType getPaymentType()
  {
      return paymentType;
  }
  public InvoiceStatus getInvoiceStatus()
  {
      return status;
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
  public void setPaymentType(PaymentType paymentType)
  {
      this.paymentType = paymentType;
  }
  public void setInvoiceStatus(InvoiceStatus status)
  {
      this.status = status;
  }
  public void printData()
  {
      System.out.println("=======INVOICE=======");
      System.out.println("ID: "+id);
      System.out.println("Food ID: "+idFood);
      System.out.println("Date: "+date);
      System.out.println("Customer: "+customer.getName());
      System.out.println("Total Price: " +totalPrice);
      System.out.println("Status: "+status);
  }
}
