public class JFood
{
   public static void main (String[] args)
   {
      Location location1 = new Location("Jakarta", "DKI Jakarta", "Indonesia");
      location1.printData();
        
      Seller seller1 = new Seller(123, "Flip", "flip@mail.com", "14045", location1);
      seller1.printData();
        
      Food food1 = new Food(456, "Burger", seller1, 50000, "Makanan");
      food1.printData();
        
      Customer customer1 = new Customer(789, "Ivan", "ivan@mail.com", "12345678", "01-01-2020");
 
      Invoice invoice1 = new Invoice(001, 100, "02-02-2020", customer1, 55000);
   }
}
