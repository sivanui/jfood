import java.util.Calendar;
import java.util.*;
import java.text.*;
import java.util.regex.*;
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
   private Calendar joinDate;

   public Customer(int id, String name, String email, String password,
   Calendar joinDate)
   {
       this.id = id;
       this.name = name;
       this.email = email;
       this.password = password;
       this.joinDate = joinDate;
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
   }
   public Customer(int id, String name, String email, String password,
   int year, int month, int dayOfMonth)
   {
       this.id = id;
       this.name = name;
       this.email = email;
       this.password = password;
       joinDate = new GregorianCalendar (dayOfMonth, month, year);
   }
   public Customer(int id, String name, String email, String password)
   {
       this.id = id;
       this.name = name;
       this.email = email;
       this.password = password;
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
   public Calendar getJoinDate()
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
        String emailRegex ="^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        this.email = (matcher.matches())?email: null;
    }
   public void setPassword(String password)
    {
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern passwordPattern = Pattern.compile(passwordRegex);
        Matcher passwordMatcher = passwordPattern.matcher(password);
        this.password = (passwordMatcher.matches())?password: null;
    }
   public void setJoinDate(Calendar joinDate)
   {
       this.joinDate = joinDate;
   }
   public void setJoinDate(int year, int month, int dayOfMonth)
   {
       joinDate = new GregorianCalendar(dayOfMonth, month, year);
   }
   public String toString()
    {
       if(joinDate != null)
       {
           return"ID:  "+id+"\nName: "+name+"\nEmail: "+email+"\nPassword: "+password+"\nDate: "+
           joinDate.get(Calendar.DAY_OF_MONTH)+"/"+
           joinDate.get(Calendar.MONTH)+"/"+
           joinDate.get(Calendar.YEAR)+"\n";
       }
       else
       {    
           return"ID:  "+id+"\nName: "+name+"\nEmail: "+email+"\nPassword: "+password+"\n";
       }
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
