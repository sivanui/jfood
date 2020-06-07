package ivan.jfood;
/**
 * Enumeration class FoodCategory
 *
 * @author Sulaiman Ivan Achmadi
 * @version 06/07/20
 */
public enum FoodCategory
{
    BEVERAGES("Beverages"),
    COFFEE("Coffee"),
    WESTERN("Western"), 
    SNACKS("Snacks"),
    RICE("Rice"),
    NOODLES("Noodles"),
    BAKERY("Bakery"),
    JAPANESE("Japanese");
    
    private String category;

    /**
     * Constructor for objects of class FoodCategory
     * @param category food category
     */
    FoodCategory(String category)
    {
        this.category=category;
    }

    /**
     * Method toString
     */
    public String toString()
    {
        return this.category;
    }
}



