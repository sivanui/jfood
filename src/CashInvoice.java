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

 public CashInvoice(int id, ArrayList<Food> foods, Calendar date,
 Customer customer)
 {
     super(id, foods, customer);
 }
 public CashInvoice(int id, ArrayList<Food> foods, Customer customer,
 int deliveryFee)
 {
     super(id, foods, customer);
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
    public void setTotalPrice() {
        for (int i = 0; i <= getFoods().size(); i++) {
            if (deliveryFee > 0) {
                totalPrice = getFoods().get(i).getPrice() + getDeliveryFee();
            } else {
                totalPrice = getFoods().get(i).getPrice();

            }
        }
    }
    public String toString(){
        String string = "";
        for (int i = 0; i <= getFoods().size(); i++){
            if (deliveryFee == 0){
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                LocalDateTime now = LocalDateTime.now();
                string = ("================INVOICE================" +
                                "\nID: " + super.getId() +
                                "\nFood: " + super.getFoods().get(i).getName() +
                                "\nDate: " + dtf.format(now) +
                                "\nCustomer: " + super.getCustomer().getName() +
                                "\nTotal Price: " + getFoods().get(i).getPrice() +
                                "\nStatus: " + super.getInvoiceStatus() +
                                "\nPayment Type: " + PAYMENT_TYPE + "\n");
            } else {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                LocalDateTime now = LocalDateTime.now();
                string =
                        ("================INVOICE================" +
                                "\nID: " + super.getId() +
                                "\nFood: " + super.getFoods().get(i).getName() +
                                "\nDate: " + dtf.format(now) +
                                "\nCustomer: " + super.getCustomer().getName() +
                                "\nDeliveryFee : " + getDeliveryFee() +
                                "\nTotal Price: " + super.getTotalPrice() +
                                "\nStatus: " + super.getInvoiceStatus() +
                                "\nPayment Type: " + PAYMENT_TYPE + "\n");
            }
        }
        System.out.println(string);
        return string;
    }
}
