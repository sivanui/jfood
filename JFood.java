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
   (123, "Burger", seller1, 50000, FoodCategory.RICE);
           
   Customer customer1 = new Customer
   (1706040302, "John Doe", "johndoe@gmail.com", "+62876543210",
   "01-01-2020");
 
   // Invoice invoice1 = new Invoice
   // (001, 123, "02-02-2020", 50000, customer1, PaymentType.CASH,
   // InvoiceStatus.FINISHED);
    
   System.out.println(seller1.getName());
   seller1.setName("Fadel");
   System.out.println(seller1.getName());
   food1.printData();
   // invoice1.printData();
  }
}
