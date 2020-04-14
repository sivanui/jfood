package ivan.jfood;
/**
 * This is class Location.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 27/2/20
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

 public Location(String city, String province, String description)
 {
     this.city = city;
     this.province = province;
     this.description = description;
 }
 public String getProvince()
 {
     return province;
 }
 public String getCity()
 {
     return city;
 }
 public String getDescription()
 {
     return description;
 }
 public void setProvince(String province)
 {
     this.province = province;
 }
 public void setCity(String city)
 {
     this.city = city;
 }
 public void setDescription(String description)
 {
     this.description = description;
 }
 public String toString()
    {
        return province+""+city+""+description;
    }
 //public void printData()
 //{
 //    System.out.println(province);
 //}
}
