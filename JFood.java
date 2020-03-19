import java.util.Calendar;
import java.util.*;
import java.text.*;
import java.util.regex.*;
public class JFood
{
  public static void main (String[] args)
  {
   Location location1 = new Location
   ("Jakarta", "DKI Jakarta", "Indonesia");
    
   Seller seller1 = new Seller
   (1706043052, "Sulaiman Ivan Achmadi", "ivan.achmadi@gmail.com",
   "+62818970818", location1);  

   Food food1 = new Food
   (123, "Burger", seller1, 50000, FoodCategory.WESTERN);
   
   Food food2 = new Food
   (234, "Hot Dog", seller1, 10000, FoodCategory.WESTERN);
   
   Customer customer1 = new Customer
   (1706070809, "Jimmy Jimmy", "jimmy@gmail.com", "Password1", new GregorianCalendar(2020, 03, 20));
   
   Customer customer2 = new Customer
   (1706060606, "Jonathan", "jonathan@gmail.com", "Password2", 19, 03, 2020);
   
   Customer customer3 = new Customer
   (1706040302, "John Doe", "johndoe@gmail.com", "Password3");
   
   Promo promo1 = new Promo
   (100, "ABCDE", 10000, 30000, true);
   
   CashlessInvoice cashlessinvoice1 = new CashlessInvoice
   (001, food1, "02-02-2020", customer1, InvoiceStatus.ONGOING);
   
   CashlessInvoice cashlessinvoice2 = new CashlessInvoice
   (002, food1, "20-02-2020", customer1, InvoiceStatus.ONGOING,
   promo1);
   
   CashlessInvoice cashlessinvoice3 = new CashlessInvoice
   (003, food2, "22-02-2020", customer1, InvoiceStatus.ONGOING,
   promo1);
   
   CashInvoice cashinvoice1 = new CashInvoice
   (004, food1, "23-02-2020", customer1, InvoiceStatus.FINISHED);
   
   CashInvoice cashinvoice2 = new CashInvoice
   (005, food1, "24-02-2020", customer1, InvoiceStatus.FINISHED, 10000);
   
   //cashinvoice1.setTotalPrice();
   //cashinvoice2.setTotalPrice();
   //System.out.println(seller1.getName());
   //seller1.setName("Fadel");
   //System.out.println(seller1.getName());
   //food1.printData();
   //food2.printData()
   //cashlessinvoice1.setTotalPrice();
   //cashlessinvoice2.setTotalPrice();
   //cashlessinvoice3.setTotalPrice();
   //cashlessinvoice1.printData();
   //cashlessinvoice2.printData();
   //cashlessinvoice3.printData();
   //cashinvoice1.printData();
   //cashinvoice2.printData();
   System.out.println (customer1.toString());
   System.out.println (customer2.toString());
   System.out.println (customer3.toString());
  }
}
