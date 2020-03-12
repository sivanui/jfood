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

 public CashlessInvoice(int id, Food food, String date,
 Customer customer, InvoiceStatus invoiceStatus)
 {
     super(id, food, date, customer, invoiceStatus);
 }
 public CashlessInvoice(int id, Food food, String date,
 Customer customer, InvoiceStatus invoiceStatus, Promo promo)
 {
     super(id, food, date, customer, invoiceStatus);
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
 public void setTotalPrice()
 {
     if(getPromo().getActive() == true &&
     getFood().getPrice() > getPromo().getMinPrice())
     {
         this.totalPrice = getFood().getPrice()-getPromo().getDiscount();
     }
     else
     {
         this.totalPrice = getFood().getPrice();
     }
 }
 public void printData()
 {
     if(getPromo().getActive() == true &&
     getFood().getPrice() > getPromo().getMinPrice())
     {
         System.out.println("=======INVOICE=======");
         System.out.println("ID: "+getId());
         System.out.println("Food: "+getFood());
         System.out.println("Date: "+getDate());
         System.out.println("Customer: "+getCustomer());
         System.out.println("Total Price: " +totalPrice);
         System.out.println("Status: "+getInvoiceStatus());
         System.out.println("Payment Type: "+PAYMENT_TYPE);
         System.out.println("Code: "+promo.getCode());
     }
     else
     {
         System.out.println("=======INVOICE=======");
         System.out.println("ID: "+getId());
         System.out.println("Food: "+getFood());
         System.out.println("Date: "+getDate());
         System.out.println("Customer: "+getCustomer());
         System.out.println("Total Price: " +totalPrice);
         System.out.println("Status: "+getInvoiceStatus());
         System.out.println("Payment Type: "+PAYMENT_TYPE);
     }
 }
}
