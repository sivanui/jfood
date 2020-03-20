
/**
 * Write a description of class Customer here.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 1.2 (19 Mar 2020)
 * 
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;

public class Customer//create class Customer
{
    /**
     * membuat variabel di class customer
     * variabel instance
     * private hanya bisa diberikan pada member class
     */
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;
      

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        String emailRegex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
       Pattern emailPattern = Pattern.compile(emailRegex);
       Matcher emailMatcher = emailPattern.matcher(email);
       
       if(emailMatcher.matches())
       {
           this.email=email;
       }
       else 
       {
           this.email="";
       }
       
       String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
       Pattern passwordPattern = Pattern.compile(passwordRegex);
       Matcher passwordMatcher = passwordPattern.matcher(password);
       
       if(passwordMatcher.matches())
       {
           this.password=password;
       }
       else 
       {
           this.password="";
       }
       
       this.joinDate = joinDate;
 
    }
    
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        String emailRegex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
       Pattern emailPattern = Pattern.compile(emailRegex);
       Matcher emailMatcher = emailPattern.matcher(email);
       
       if(emailMatcher.matches())
       {
           this.email=email;
       }
       else 
       {
           this.email="";
       }
       
       String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
       Pattern passwordPattern = Pattern.compile(passwordRegex);
       Matcher passwordMatcher = passwordPattern.matcher(password);
       
       if(passwordMatcher.matches())
       {
           this.password=password;
       }
       else 
       {
           this.password="";
       }
       
       this.joinDate= new GregorianCalendar(dayOfMonth,month,year);
 
    }
    
    public Customer(int id, String name, String email, String password)
    {
       this.id = id;
       this.name = name;
       String emailRegex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
       Pattern emailPattern = Pattern.compile(emailRegex);
       Matcher emailMatcher = emailPattern.matcher(email);
       
       if(emailMatcher.matches())
       {
           this.email=email;
       }
       else 
       {
           this.email="";
       }
       
       String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
       Pattern passwordPattern = Pattern.compile(passwordRegex);
       Matcher passwordMatcher = passwordPattern.matcher(password);
       
       if(passwordMatcher.matches())
       {
           this.password=password;
       }
       else 
       {
           this.password="";
       }
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
        this.id =id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        String pattern =  "^[a-zA-Z0-9_+&*-]+(?:\\."+  
                            "[a-zA-Z0-9_+&*-]+)*@" +  
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +  
                            "A-Z]{2,7}$"+
                            "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.println("Email : " + m.group());
            this.email = email;
        } else {
            System.out.println("Email : null");
            this.email = email;
        }
    }
    
    public void setPassword(String password)
    {
        String pattern = ".{6,}";
        String pattern1 = "(.*)[a-z]{1,}(.*)";
        String pattern2 = "(.*)[A-Z]{1,}(.*)";
        String pattern3 = "(.*)[0-9]{1,}(.*)";
        
        if (Pattern.matches(pattern, password)&& 
        Pattern.matches(pattern1, password))
        {
            this.password = password;
            System.out.println("You have changed your password successfully");
        }
        else
        {
            this.password = null;
            System.out.println("Invalid password!");
        }
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        joinDate = new GregorianCalendar (year, month, dayOfMonth);
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
    
  

}
