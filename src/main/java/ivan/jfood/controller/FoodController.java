package ivan.jfood.controller;

import ivan.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/food")
@RestController
public class FoodController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood() {
        return DatabaseFood.getFoodDatabase();
    }

    @RequestMapping(value = "{foodId}", method = RequestMethod.GET)
    public Food getFoodById(@PathVariable int foodId) throws FoodNotFoundException {
        Food food = DatabaseFood.getFoodById(foodId);
        return food;
    }

    @RequestMapping(value = "/seller/{sellerId}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodBySeller(@PathVariable int sellerId) throws FoodNotFoundException {
        ArrayList<Food> food = DatabaseFood.getFoodBySeller(sellerId);
        return food;
    }

    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodByCategory(@PathVariable FoodCategory category) throws FoodNotFoundException {
        ArrayList<Food> food = DatabaseFood.getFoodByCategory(category);
        return food;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Food addFood(@RequestParam(value = "name") String name,
                        @RequestParam(value = "price") int price,
                        @RequestParam(value = "category") FoodCategory category,
                        @RequestParam(value = "sellerId") int sellerId) {
        Food food = null;
        try {
            food = new Food(DatabaseFood.getLastId() + 1, name, DatabaseSeller.getSellerById(sellerId), price, category);
            DatabaseFood.addFood(food);
        } catch (SellerNotFoundException s) {
            System.out.println(s.getMessage());
        }
        return food;
    }
}