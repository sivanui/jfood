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
 * @version 6/7/20
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

      /**
       * Constructor for objects of class Invoice
       * @param id invoice's id
       * @param foods invoice's food
       * @param customer invoice's customer
       */
  public Invoice(int id, ArrayList<Food> foods,
  Customer customer)
  {
     this.id = id;
     this.foods = foods;
     this.date=Calendar.getInstance();
     this.customer = customer;
     this.invoiceStatus = InvoiceStatus.Ongoing;
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
       * Get food
       * @return foods
       */
  public ArrayList<Food> getFoods()
  {
     return foods;
  }

      /**
       * Get date
       * @return date
       */
  public Calendar getDate()
  {
       return date;
  }

      /**
       * Get total price
       * @return totalPrice
       */
  public int getTotalPrice()
  {
       return totalPrice;
  }

      /**
       * Get customer
       * @return customer
       */
  public Customer getCustomer()
  {
       return customer;
  }

      /**
       * Get payment type
       */
  public abstract PaymentType getPaymentType();

      /**
       * Get invoice status
       * @return status
       */
  public InvoiceStatus getInvoiceStatus()
  {
      return invoiceStatus;
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
       * Set food
       * @param foods foods
       */
  public void setFood(ArrayList<Food> foods)
  {
      this.foods = foods;
  }

      /**
       * Set date
       * @param date date
       */
  public void setDate(Calendar date)
  {
      this.date = date;
  }

      /**
       * Set date
       * @param year year
       * @param month month
       * @param dayOfMonth day
       */
  public void setDate(int year, int month, int dayOfMonth)
  {
      this.date = new GregorianCalendar (year, month, dayOfMonth);
  }

      /**
       * Set total price
       */
  public abstract void setTotalPrice();

      /**
       * Set customer
       * @param customer customer
       */
  public void setCustomer(Customer customer)
  {
      this.customer = customer;
  }

      /**
       * Set invoice status
       * @param invoiceStatus status
       */
  public void setInvoiceStatus(InvoiceStatus invoiceStatus)
  {
      this.invoiceStatus = invoiceStatus;
  }

      /**
       * Method toString
       */
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
