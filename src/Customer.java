import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;

/**
 * Class Customer terdiri dari atribut id, name, email, password, joinDate
 * 
 * @author  Sulaiman Ivan Achmadi
 * @version 20-03-2020
*/


public class Customer
{
    /**
     * Bagian dari variabel Instances
     * 
     */
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;
    
    /**
     * Constructor untuk objek dari Class Customer
     * 
     * @param id untuk mendefinisikan input id baru
     * @param name untuk mendefinisikan input name baru
     * @param email untuk mendefiniskan input email baru
     * @param password untuk mendefiniskan input password baru
     * @param joinDate untuk mendefiniskan input joinDate baru
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
       this.id = id;
       this.name = name;
       setEmail(email);
       setPassword(password);
       this.joinDate = Calendar.getInstance();
    }
    
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
       this.id = id;
       this.name = name;
       setEmail(email);
       setPassword(password);
       this.joinDate= new GregorianCalendar(year,month,dayOfMonth);
    }
    
    public Customer(int id, String name, String email, String password)
    {
       this.id = id;
       this.name = name;
       setEmail(email);
       setPassword(password);
    }
    
    /**
     * Getter id untuk Customer
     * @return id untuk memastikan variabel id ke variabel instance
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Getter name untuk Customer
     * @return name untuk memastikan variabel name ke variabel instance
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Getter email untuk Customer
     * @return email untuk memastikan variabel email ke variabel instance
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Getter password untuk Customer
     * @return password untuk memastikan variabel password ke variabel instance
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * Getter joinDate untuk Customer
     * @return joinDate untuk memastikan variabel joinDate ke variabel instance
     */
    public Calendar getJoinDate()
    {
    return joinDate;
    }
    
    /**
     * Setter id untuk Customer
     * @param id untuk set ke instance variabel id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Setter name untuk Customer
     * @param name untuk set ke instance variabel name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Setter email untuk Customer
     * @param email untuk set ke instance variabel email
     */
    public void setEmail(String email)
    {
        String regex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches())
        {
            this.email=email;
        }
        else 
        {
            this.email="";
        }
    }
    
    /**
     * Setter password untuk Customer
     * @param password untuk set ke instance variabel password
     */
    public void setPassword(String password)
    {
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
    
    /**
     * Setter joinDate untuk Customer
     * @param joinDate untuk set ke instance variabel joinDate
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        joinDate = new GregorianCalendar (year, month, dayOfMonth);
    }
    
    /**
     * Print Data
     */
    public String toString(){
        SimpleDateFormat formatDate = new SimpleDateFormat ("dd MMMM yyyy");
        if (joinDate == null){
            return String.format("==========CUSTOMER==========" + "\n" +
                    "Id=" + getId() + "\n" +
                    "Nama=" + getName() + "\n" +
                    "Email=" + getEmail() + "\n" +
                    "Password=" + password + "\n" +
                    "Join Date=" + null + "\n");
        } else {
            return String.format("==========CUSTOMER==========" + "\n" +
                    "Id=" + getId() + "\n" +
                    "Nama=" + getName() + "\n" +
                    "Email=" + getEmail() + "\n" +
                    "Password=" + password + "\n" +
                    "Join Date=" + formatDate.format(joinDate.getTime()) + "\n");

        }
    }
}
