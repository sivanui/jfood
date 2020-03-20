import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

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
  private Calendar date;
  protected int totalPrice;
  private Customer customer;
  private InvoiceStatus invoiceStatus;
  public Invoice(int id, Food food,
  //Calendar date,
  Customer customer,
  InvoiceStatus invoiceStatus)
  {
     this.id = id;
     this.food = food;
     //this.date = date;
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
  public void setFood(Food food)
  {
      this.food = food;
  }
  public void setDate(Calendar date)
  {
      this.date = date;
  }
  public void setDate(int year, int month, int dayOfMonth)
  {
      date = new GregorianCalendar (year, month-1, dayOfMonth);
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
  public void printData()
  {
      System.out.println("=====INVOICE=====");
        System.out.println("ID: " +getId());
        System.out.println("Food: " +getFood());
        System.out.println("Customer: " +getCustomer().getName());
        System.out.println("Total Price: " +getTotalPrice());
        System.out.println("Status: " +getInvoiceStatus());
  }
}
