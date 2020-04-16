package ivan.jfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

@SpringBootApplication
public class JFood {
 public static void main(String[] args) {
  Location location1 = new Location("Jakarta Pusat", "DKI Jakarta", "Indonesia");
  Location location2 = new Location("Jakarta Utara", "DKI Jakarta", "Indonesia");
  Location location3 = new Location("Jakarta Timur", "DKI Jakarta", "Indonesia");
  DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Fadel", "fadel@gmail.com", "+62812345678", location1));
  DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Sulaiman Ivan Achmadi", "ivan.achmadi@gmail.com", "+62818970818", location1));
  DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Sulaiman Ivan Achmadi", "ivan.achmadi@gmail.com", "+62818970818", location1));
  try {
   DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Hot Dog", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 20000, FoodCategory.WESTERN));
  } catch (SellerNotFoundException s) {
   System.err.println(s.getMessage());
  }
  try {
   DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Burger", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 30000, FoodCategory.WESTERN));
  } catch (SellerNotFoundException s) {
   System.err.println(s.getMessage());
  }
  try {
   DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Lemon Tea", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 10000, FoodCategory.BEVERAGES));
  } catch (SellerNotFoundException s) {
   System.err.println(s.getMessage());
  }
  try {
   DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Soda", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 10000, FoodCategory.BEVERAGES));
  } catch (SellerNotFoundException s) {
   System.err.println(s.getMessage());
  }
  SpringApplication.run(JFood.class, args);
  /*
  Location location1 = new Location("Jakarta", "DKI Jakarta", "Indonesia");
  Calendar calendar = new GregorianCalendar(2020, 4, 2);
  DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Sulaiman Ivan Achmadi", "ivan.achmadi@gmail.com", "+62818970818", location1));
  DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Sulaiman Ivan Achmadi", "ivan.achmadi@gmail.com", "+62818970818", location1));
  DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Fadel", "fadel@gmail.com", "+62812345678", location1));

  try
  {
   DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Fadel", "fadel@gmail.com", "Password3"));
   DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Fadel", "ledaf@gmail.com", "Password4"));
   DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Ivan", "ivan@gmail.com", "Password1", calendar));
   DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Ivan", "ivan@gmail.com", "Password2", 2020, 4,2));
  } catch (EmailAlreadyExistsException e)
  {
   System.err.println(e.getMessage());
  }
*/
/*
  System.out.println("Daftar Customer: ");
  for (Customer customer : DatabaseCustomer.getCustomerDatabase())
  {
   System.out.println(customer.getName());
  }
  System.out.println();
*/
/*
  try
  {
   DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Hot Dog", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 10000, FoodCategory.WESTERN));
   DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Nasi Goreng", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 13000, FoodCategory.RICE));
  } catch (SellerNotFoundException s)
  {
   System.err.println(s.getMessage());
  }
 */
  /*
  System.out.println("Daftar Food Category Western: ");
  for (Food food : DatabaseFood.getFoodByCategory(FoodCategory.WESTERN))
  {
   System.out.println(food.getName());
  }
  System.out.println();
*/
  /*
  try
  {
   DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "ABCDE", 5000, 20000, false));
   DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "ABCDE", 10000, 20000, true));
  } catch (PromoCodeAlreadyExistsException p)
  {
   System.err.println(p.getMessage());
  }
   */
/*
  System.out.println("Promo: ");
  for (Promo promo: DatabasePromo.getPromoDatabase())
  {
   System.out.println(promo.getCode());
  }
*/
/*
  try {
   DatabaseCustomer.removeCustomer(50);
  } catch (CustomerNotFoundException c){
   System.err.println(c.getMessage());
  }

  try {
   DatabasePromo.removePromo(99);
  } catch (PromoNotFoundException p){
   System.err.println(p.getMessage());
  }

  try {
   DatabaseFood.removeFood(100);
  } catch (FoodNotFoundException f){
   System.err.println(f.getMessage());
  }

  try {
   DatabaseInvoice.removeInvoice(100);
  } catch (InvoiceNotFoundException i){
   System.err.println(i.getMessage());
  }
 */
  /*
  System.out.println("=====DATABASE PROMO=====");

  for(Promo promo : DatabasePromo.getPromoDatabase()){
   System.out.println(promo.toString());
  }
  */
/*
  ArrayList<Food> food1 = new ArrayList<Food>();

  try
  {
   food1.add(DatabaseFood.getFoodById(1));
   food1.add(DatabaseFood.getFoodById(2));
  }
  catch (FoodNotFoundException f)
  {
   System.err.println(f.getMessage());
  }

  try
  {
   DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, food1, DatabaseCustomer.getCustomerById(1), 10000));
   DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, food1, DatabaseCustomer.getCustomerById(2), 10000));
  }
  catch (CustomerNotFoundException | OngoingInvoiceAlreadyExistsException c)
  {
   System.err.println(c.getMessage());
  }

  for(Invoice invoices : DatabaseInvoice.getInvoiceDatabase())
  {
   new Thread(new PriceCalculator(invoices)).start();
  }

  System.out.println("\n=========ISI DATABASE CUSTOMER==========");
  for(Customer customer : DatabaseCustomer.getCustomerDatabase()) {
   System.out.println(customer);
   System.out.println();
  }
  System.out.println("=========ISI DATABASE PROMO==========");
  for(Promo promo : DatabasePromo.getPromoDatabase()) {
   System.out.println(promo);
   System.out.println();
  }
  System.out.println("=========ISI DATABASE FOOD==========");
  for(Food food : DatabaseFood.getFoodDatabase()) {
   System.out.println(food);
   System.out.println();
  }
 */

  /*
  ArrayList<Food> menu = new ArrayList<Food>();
  menu.add(DatabaseFood.getFoodById(1));
  menu.add(DatabaseFood.getFoodById(1));
  menu.add(DatabaseFood.getFoodById(1));
  ArrayList<Food> menu2 = DatabaseFood.getFoodDatabase();

  DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, menu, DatabaseCustomer.getCustomerById(1),10000));
  DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();

  DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, menu2, DatabaseCustomer.getCustomerById(1)));
  DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();

  System.out.println("Invoice: ");
  for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase()) {
   System.out.println(invoice);
  }

  DatabaseInvoice.changeInvoiceStatus(DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).getId(),InvoiceStatus.FINISHED);

  DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, menu2, DatabaseCustomer.getCustomerById(2), DatabasePromo.getPromoByCode("ABCDE")));
  DatabasePromo.activatePromo(1);

  System.out.println("Invoice: ");
  for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
  {
   invoice.setTotalPrice();
   System.out.println(invoice);
  }
*/
  //DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(1), 25000));
  //DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(1), DatabasePromo.getPromoById(1)));
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
