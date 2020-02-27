/**
 * This is class Customer.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 27/2/20
 */
public class Customer //Create the class Customer
{
   private int id;
   private String name;
   private String email;
   private String password;
   private String joinDate;

   public Customer(int id, String name, String email, String password, String joinDate)
   {
       this.id = id;
       this.name = name;
       this.email = email;
       this.password = password;
       this.joinDate = joinDate;
   }
   public int getId()
   {
       return id;
   }
   public String getName()
   {
       return name;
   }
   public String getEmail()
   {
       return email;
   }
   public String getPassword()
   {
       return password;
   }
   public String getJoinDate()
   {
       return joinDate;
   }
   public void setId(int id)
   {
       this.id = id;
   }
   public void setName(String name)
   {
       this.name = name;
   }
   public void setEmail(String email)
   {
       this.email = email;
   }
   public void setPassword(String password)
   {
       this.email = email;
   }
   public void setJoinDate(String joinDate)
   {
       this.joinDate = joinDate;
   }
   /* Below is used to
    * print the name of
    * the Customer
    */
   public void printData()
   {
       System.out.println(name);
   }
}
