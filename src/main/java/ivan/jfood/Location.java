package ivan.jfood;
/**
 * This is class Location.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 6/7/20
 */
public class Location //Create the class Location
{
 /* Below is used to
   * declare the variables
   * of the Location
   */
 private String province;
 private String description;
 private String city;

    /**
     * Constructor for objects of class Location
     * Constructor for objects of class Customer
     * @param city city
     * @param province province
     * @param description description
     */
 public Location(String city, String province, String description)
 {
     this.city = city;
     this.province = province;
     this.description = description;
 }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     * Get province
     * @return province
     */
 public String getProvince()
 {
     return province;
 }

    /**
     * Get city
     * @return city
     */
 public String getCity()
 {
     return city;
 }

    /**
     * Get description
     * @return description
     */
 public String getDescription()
 {
     return description;
 }

    /**
     * Set province
     * @param province province
     */
 public void setProvince(String province)
 {
     this.province = province;
 }

    /**
     * Set city
     * @param city city
     */
 public void setCity(String city)
 {
     this.city = city;
 }

    /**
     * Set description
     * @param description description
     */
 public void setDescription(String description)
 {
     this.description = description;
 }

    /**
     * Method toString
     */
 public String toString()
    {
        return province+""+city+""+description;
    }
 //public void printData()
 //{
 //    System.out.println(province);
 //}
}
