package Grocery;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;


public class GroceryList {


    public static  HashMap<String, ArrayList<GroceryItem>> dataForGroceries(){
        // Array list for Dairy
        ArrayList<GroceryItem>Dairy = new ArrayList<>();
        Dairy.add(new GroceryItem("Eggs", 12));
        Dairy.add(new GroceryItem("Milk", 6));
        Dairy.add(new GroceryItem("Greek Yogurt", 6));
        Dairy.add(new GroceryItem("Butter",8));

        // Array list for Meat
        ArrayList<GroceryItem> Meat = new ArrayList<>();
        Meat.add(new GroceryItem("T-Bone Steak", 8));
        Meat.add(new GroceryItem("Trout", 2));
        Meat.add(new GroceryItem("Smokehouse Salmon", 6));
        Meat.add(new GroceryItem("Canadian Bacon", 12));

        // Array list for Pastries
        ArrayList<GroceryItem> Pastries = new ArrayList<>();
        Pastries.add(new GroceryItem("Croissant", 6));
        Pastries.add(new GroceryItem("White Bread", 2));
        Pastries.add(new GroceryItem("Beignet", 8));
        Pastries.add(new GroceryItem("Eclair", 9));

        // Array list for Vegetables
        ArrayList<GroceryItem> Vegetables = new ArrayList<>();
        Vegetables.add(new GroceryItem("Broccoli", 1));
        Vegetables.add(new GroceryItem("Eggplant", 3));
        Vegetables.add(new GroceryItem("Asparagus", 5));
        Vegetables.add(new GroceryItem("Brussels Sprouts", 7));

        HashMap<String, ArrayList<GroceryItem>> Categories = new HashMap<>();
        Categories.put("Vegetables",Vegetables);
        Categories.put("Pastries", Pastries);
        Categories.put("Meat", Meat);
        Categories.put("Dairy", Dairy);


        return Categories;
    }


}