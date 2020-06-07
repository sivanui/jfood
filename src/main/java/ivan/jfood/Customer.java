package ivan.jfood;

/**
 * Class Customer terdiri dari atribut id, name, email, password, joinDate
 *
 * @author  Sulaiman Ivan Achmadi
 * @version 20-03-2020
 */

import java.util.*;
import java.util.regex.*;
import java.text.*;

public class Customer
{
    // instance variables - replace the example below with your own
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
        this.joinDate = joinDate;

        setEmail(email);
        setPassword(password);
    }

    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {

        this.id = id;
        this.name = name;
        this.joinDate = new GregorianCalendar(year, month-1, dayOfMonth);

        setEmail(email);
        setPassword(password);
    }

    public Customer(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.joinDate = Calendar.getInstance();

        setEmail(email);
        setPassword(password);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * param y a sample parameter for a method
     * return    the sum of x and y
     */
    public int getId()
    {
        // put your code here
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
        String regex = "^([\\w\\&\\*_~]+\\.{0,1})+@[\\w][\\w\\-]*(\\.[\\w\\-]+)+$";
        if(Pattern.matches(regex,email)){
            this.email = email;
        }
        else{
            this.email = "";
        }
    }

    public void setPassword(String password)
    {
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        if(Pattern.matches(regex,password)){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }

    public void setJoinDate(GregorianCalendar joinDate)
    {
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate.set(year, month-1, dayOfMonth);
    }

    public String toString()
    {
        if(joinDate != null){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
            String string = "Id: "+this.id+"\nNama: "+this.name+"\nEmail: "+email+"\nPassword: "+password+"\nJoin Date: " +
                    dateFormat.format(joinDate.getTime());
            return string;
        }
        else{
            String string = "Id: "+this.id+"\nNama: "+this.name+"\nEmail: "+email+"\nPassword: "+password;
            return string;
        }
    }
}