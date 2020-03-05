/**
 * Enumeration class FoodCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
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
    FoodCategory(String category)
    {
        this.category=category;
    }
    public String toString()
    {
        return this.category;
    }
}



