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
 * This is class CashInvoice.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 13/3/20
 */
public class CashInvoice extends Invoice
//Create the class CashInvoice
{
 /* Below is used to
   * declare the variables
   * of the CashlessInvoice
   */
 private static final PaymentType PAYMENT_TYPE = PaymentType.CASH;
 private int deliveryFee;

 public CashInvoice(int id, Food food, Calendar date,
 Customer customer, InvoiceStatus invoiceStatus)
 {
     super(id, food,
     //date,
     customer, invoiceStatus);
 }
 public CashInvoice(int id, Food food,
 //Calendar date,
 Customer customer, InvoiceStatus invoiceStatus,
 int deliveryFee)
 {
     super(id, food,
     //date,
     customer, invoiceStatus);
     this.deliveryFee = deliveryFee;
 }
 public PaymentType getPaymentType()
 {
     return PAYMENT_TYPE;
 }
 public int getDeliveryFee()
 {
     return deliveryFee;
 }
 public void setDeliveryFee(int deliveryFee)
 {
     this.deliveryFee = deliveryFee;
 }
 public void setTotalPrice()
 {
     if(deliveryFee != 0)
     {
         this.totalPrice = getFood().getPrice()+getDeliveryFee();
     }
     else
     {
         this.totalPrice = getFood().getPrice();
     }
 }
 public String toString()
 {
     String string = "";
     if(deliveryFee == 0)
     {
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
         LocalDateTime now = LocalDateTime.now(); 
         string=
         ("================INVOICE================" +
         "\nID: " +super.getId() +
         "\nFood: " +super.getFood().getName() +
         "\nDate: " +dtf.format(now)+
         "\nCustomer: " +super.getCustomer().getName() +
         "\nTotal Price: " +getFood().getPrice() +
         "\nStatus: " +super.getInvoiceStatus() +
         "\nPayment Type: " +PAYMENT_TYPE + "\n");
     }
     else
     {
         DateTimeFormatter skrg = DateTimeFormatter.ofPattern("dd MMMM yyyy");
         LocalDateTime now = LocalDateTime.now(); 
         string=
         ("================INVOICE================" +
         "\nID: " +super.getId() +
         "\nFood: " +super.getFood().getName() +
         "\nDate: " +skrg.format(now)+
         "\nCustomer: " +super.getCustomer().getName() +
         "\nDeliveryFee : " + getDeliveryFee() +
         "\nTotal Price: " +super.getTotalPrice() +
         "\nStatus: " +super.getInvoiceStatus() +
         "\nPayment Type: " +PAYMENT_TYPE + "\n");
     }
     System.out.println(string);
     return string;
    }
 /** public void printData()
 {
     if(deliveryFee != 0)
     {
         System.out.println("=======INVOICE=======");
         System.out.println("ID: "+getId());
         System.out.println("Food: "+getFood().getName());
         System.out.println("Date: "+getDate());
         System.out.println("Customer: "+getCustomer().getName());
         System.out.println("Total Price: " +totalPrice);
         System.out.println("Status: "+getInvoiceStatus());
         System.out.println("Payment Type: "+PAYMENT_TYPE);
         System.out.println("Delivery Fee: "+getDeliveryFee());
     }
     else
     {
         System.out.println("=======INVOICE=======");
         System.out.println("ID: "+getId());
         System.out.println("Food: "+getFood().getName());
         System.out.println("Date: "+getDate());
         System.out.println("Customer: "+getCustomer().getName());
         System.out.println("Total Price: " +totalPrice);
         System.out.println("Status: "+getInvoiceStatus());
         System.out.println("Payment Type: "+PAYMENT_TYPE);
     }
 }
 **/
}
