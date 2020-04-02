import java.util.Calendar;
import java.util.Date;
import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
public class JFood
{
 public static void main (String[] args)
 {
  Location location1 = new Location("Jakarta", "DKI Jakarta", "Indonesia");

  DatabaseSeller.addSeller(new Seller(1, "Sulaiman Ivan Achmadi", "ivan.achmadi@gmail.com", "+62818970818", location1));

  Calendar calendar = new GregorianCalendar(2020, 4, 2);

  //Food food1 = new Food(123, "Burger", seller1, 50000, FoodCategory.WESTERN);
  //Food food2 = new Food(234, "Hot Dog", seller1, 10000, FoodCategory.WESTERN);

  DatabaseCustomer.addCustomer(new Customer(1, "Ivan", "ivan@gmail.com", "Password1", calendar));
  DatabaseCustomer.addCustomer(new Customer(2, "Ivan", "ivan@gmail.com", "Password2", 2020, 4,2));
  DatabaseCustomer.addCustomer(new Customer(3, "Fadel", "fadel@gmail.com", "Password3"));

  System.out.println("Daftar Customer: ");
  for (Customer customer : DatabaseCustomer.getCustomerDatabase())
  {
   System.out.println(customer.getName());
  }

  DatabaseFood.addFood(new Food(1, "Burger", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 50000, FoodCategory.WESTERN));
  DatabaseFood.addFood(new Food(2, "Hot Dog", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 10000, FoodCategory.WESTERN));
  DatabaseFood.addFood(new Food(3, "Nasi Goreng", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 13000, FoodCategory.RICE));

  System.out.println("Daftar Food Category Western: ");
  for (Food food : DatabaseFood.getFoodByCategory(FoodCategory.WESTERN))
  {
   System.out.println(food.getName());
  }
  //Promo promo1 = new Promo(100, "ABCDE", 10000, 30000, true);

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
  //cashinvoice1.toString();
  //cashinvoice2.toString();
  //cashlessinvoice1.toString();
  //cashlessinvoice2.toString();
  //cashlessinvoice3.toString();
  //System.out.println (customer1.toString());
  //System.out.println (customer2.toString());
  //System.out.println (customer3.toString());
 }
}
