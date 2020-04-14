package ivan.jfood;
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
 private static final PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
 private Promo promo;

 public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
 {
     super(id, foods, customer);
 }
 public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer,  Promo promo)
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
     super.totalPrice=0;
     for(Food listFood : getFoods())
     {
         super.totalPrice=super.totalPrice+listFood.getPrice();
     }
     if(promo != null && super.totalPrice>=promo.getMinPrice() && promo.getActive() == true) {
         super.totalPrice = super.totalPrice - promo.getDiscount();
     }
 }
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        String foods = "";
        for(Food foodList : getFoods())
        {
            foods = foods + foodList.getName() + ", ";
        }
        foods = foods.substring(0, foods.length() - 2);

        if(promo != null && promo.getActive() == true) {
            return "============INVOICE CASHLESS============"+
                    "\nID :" + super.getId()+
                    "\nFoods :"  + foods+
                    "\nDate :" + sdf.format(super.getDate().getTime())+
                    "\nCustomer :" + super.getCustomer().getName()+
                    "\nPromo Code:" + promo.getCode()+
                    "\nTotal price :" + totalPrice+
                    "\nStatus :" + super.getInvoiceStatus()+
                    "\nPayment Type :" + getPaymentType();
        }else {
            return "============INVOICE CASHLESS============"+
                    "\nID :" + super.getId()+
                    "\nFoods :"  + foods+
                    "\nDate :" + sdf.format(super.getDate().getTime())+
                    "\nCustomer :" + super.getCustomer().getName()+
                    "\nTotal price :" + totalPrice+
                    "\nStatus :" + super.getInvoiceStatus()+
                    "\nPayment Type :" + getPaymentType();
        }
    }
 }
