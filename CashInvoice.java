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
 private static PaymentType PAYMENT_TYPE = PaymentType.CASH;
 private int deliveryFee;

 public CashInvoice(int id, Food food, String date,
 Customer customer, InvoiceStatus invoiceStatus)
 {
     super(id, food, date, customer, invoiceStatus);
 }
 public CashInvoice(int id, Food food, String date,
 Customer customer, InvoiceStatus invoiceStatus,
 int deliveryFee)
 {
     super(id, food, date, customer, invoiceStatus);
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
 public void printData()
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
}
