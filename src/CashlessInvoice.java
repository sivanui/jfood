import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 * This is class CashlessInvoice.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 12/3/20
 */
public class CashlessInvoice extends Invoice
//Create the class CashlessInvoice
{
 /* Below is used to
   * declare the variables
   * of the CashlessInvoice
   */
 private PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
 private Promo promo;

 public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo invoiceStatus)
 {
     super(id, foods, customer);
 }
 public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, InvoiceStatus invoiceStatus,  Promo promo)
 {
     super(id, foods, customer);
     this.promo = promo;
 }
 public PaymentType getPaymentType()
 {
     return PAYMENT_TYPE;
 }
 public Promo getPromo()
 {
     return promo;
 }
 public void setPromo(Promo promo)
 {
     this.promo = promo;
 }
    public void setTotalPrice(){
        for(Food foodList : getFoods())
        {
            totalPrice += foodList.getPrice();
        }
        if (promo!= null  && getPromo().getActive() == true && totalPrice > getPromo().getMinPrice()){

            totalPrice = totalPrice - getPromo().getDiscount();
        } else{
            this.totalPrice = totalPrice;
        }
    }
    public String toString(){
        SimpleDateFormat formatDate = new SimpleDateFormat ("dd MMMM yyyy");
        setTotalPrice();
        String listMakanan = "";
        for (Food food : getFoods())
        {
            listMakanan += food.getName() + ", ";
        }
        if (promo!= null && getPromo().getActive() == true && totalPrice > getPromo().getMinPrice() ){
            return String.format("==========INVOICE CASHLESS==========" + "\n" +
                    "Id=" + getId() + "\n" +
                    "Food=" + listMakanan + "\n" +
                    "Date=" + formatDate.format(getDate().getTime()) + "\n" +
                    "Customer=" + getCustomer().getName() + "\n" +
                    "Total Price=" + getTotalPrice() + "\n" +
                    "Payment Type=" + getPaymentType() + "\n" +
                    "Delivery Fee=" + getPromo().getCode() + "\n");
        } else {
            return String.format("==========INVOICE CASHLESS==========" + "\n" +
                    "Id=" + getId() + "\n" +
                    "Food=" + listMakanan + "\n" +
                    "Date=" + formatDate.format(getDate().getTime()) + "\n" +
                    "Customer=" + getCustomer().getName() + "\n" +
                    "Total Price=" + getTotalPrice() + "\n" +
                    "Payment Type=" + getPaymentType() + "\n");

        }
    }
 }
