package ivan.jfood;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.time.*;
import java.text.*;
/**
 * This is class DatabaseFood.
 *
 * @author Sulaiman Ivan Achmadi
 * @version 27/2/20
 */
public class DatabaseFood //Create the class DatabaseFood
{
  /* Below is used to
   * declare the variables
   * of the DatabaseFood
   */
  private static ArrayList<Food> FOOD_DATABASE=new ArrayList<Food>();
 private static int lastId = 0;
 public static ArrayList<Food> getFoodDatabase()
    {
        return FOOD_DATABASE;
    }
 public static int getLastId()
    {
        return lastId;
    }
 public static Food getFoodById(int id) throws FoodNotFoundException
    {
        for(Food foods : FOOD_DATABASE)
        {
            if (foods.getId() == id)
            {
                return foods;
            }
        }
        throw new FoodNotFoundException(id);
    }
    public static ArrayList<Food> getFoodBySeller(int sellerId){
        ArrayList<Food> LIST_FOOD_BY_SELLER = new ArrayList<Food>();
        for(Food food : FOOD_DATABASE){
            if(food.getSeller().getId() == sellerId){
                LIST_FOOD_BY_SELLER.add(food);

            }
        }
        return LIST_FOOD_BY_SELLER;
    }
    public static ArrayList<Food> getFoodByCategory(FoodCategory category){
        ArrayList<Food> LIST_FOOD_BY_CATEGORY = new ArrayList<Food>();
        for(Food food : FOOD_DATABASE){
            if(food.getCategory() == category){
                LIST_FOOD_BY_CATEGORY.add(food);
            }
        }
        return LIST_FOOD_BY_CATEGORY;
    }
    public static boolean addFood(Food food)
    {
        FOOD_DATABASE.add(food);
        lastId = food.getId();
        return true;
    }
    public static boolean removeFood(int id) throws FoodNotFoundException
    {
        for(Food food : FOOD_DATABASE){
            if(food.getId()== id){
                FOOD_DATABASE.remove(food);
                return true;
            }
        }
        throw new FoodNotFoundException(id);
    }
}
