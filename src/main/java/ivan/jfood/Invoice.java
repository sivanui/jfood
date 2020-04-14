package ivan.jfood;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

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
  private ArrayList<Food> foods;
  private Calendar date;
  protected int totalPrice;
  private Customer customer;
  private InvoiceStatus invoiceStatus;
  public Invoice(int id, ArrayList<Food> foods,
  Customer customer)
  {
     this.id = id;
     this.foods = foods;
     this.date=Calendar.getInstance();
     this.customer = customer;
     this.invoiceStatus = InvoiceStatus.ONGOING;
  }
  public int getId()
  {
       return id;
  }
  public ArrayList<Food> getFoods()
  {
     return foods;
  }
  public Calendar getDate()
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
  public void setFood(ArrayList<Food> foods)
  {
      this.foods = foods;
  }
  public void setDate(Calendar date)
  {
      this.date = date;
  }
  public void setDate(int year, int month, int dayOfMonth)
  {
      this.date = new GregorianCalendar (year, month, dayOfMonth);
  }
  public abstract void setTotalPrice();
  public void setCustomer(Customer customer)
  {
      this.customer = customer;
  }
  public void setInvoiceStatus(InvoiceStatus invoiceStatus)
  {
      this.invoiceStatus = invoiceStatus;
  }
  public abstract String toString();
  /*
  public void printData()
  {
      System.out.println("=====INVOICE=====");
        System.out.println("ID: " +getId());
        System.out.println("Food: " +getFoods());
        System.out.println("Customer: " +getCustomer().getName());
        System.out.println("Total Price: " +getTotalPrice());
        System.out.println("Status: " +getInvoiceStatus());
  }
  */
}
