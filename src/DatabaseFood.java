import java.util.ArrayList;
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
  private static ArrayList<Food> FOOD_DATABASE=new ArrayList<Food>();;
 private static int lastId;
 public static ArrayList<Food> getFoodDatabase()
    {
        return FOOD_DATABASE;
    }
 public static int getLastId()
    {
        return lastId;
    }
 public static Food getFoodById(int id)
    {
        for(Food foods : FOOD_DATABASE)
        {
            if (foods.getId() == id)
            {
                return foods;
            }
        }
        return null;
    }
    public static ArrayList<Food> getFoodBySeller(int sellerId)
    {
        ArrayList<Food> list = new ArrayList<>();
        for(Food foods : FOOD_DATABASE)
        {
            if (foods.getSeller().getId() == sellerId)
            {
                list.add(foods);
                return FOOD_DATABASE;
            }
        }
        return list;
    }
    public static ArrayList<Food> getFoodByCategory(FoodCategory category)
    {
        ArrayList<Food> list = new ArrayList<>();
        for(Food foods: FOOD_DATABASE)
        {
            if (foods.getCategory() == category)
            {
                list.add(foods);
                return FOOD_DATABASE;
            }
        }
        return list;
    }
    public static boolean addFood(Food food)
    {
        FOOD_DATABASE.add(food);
        lastId = food.getId();
        return true;
    }

    public static boolean removeFood(int id)
    {
        for(Food food : FOOD_DATABASE) {
            if(food.getId() == id) {
                FOOD_DATABASE.remove(food);
                return true;
            }
        }
        return false;
    }
}
