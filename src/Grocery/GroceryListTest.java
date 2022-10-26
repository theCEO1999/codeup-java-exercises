package Grocery;
import util.Input;
import java.util.Collection;

import java.util.*;
// we this way
import static Grocery.GroceryList.dataForGroceries;

public class GroceryListTest {

    public static String PromptUserInt(){

        // need to figure out how to put input in here
        System.out.println("Would you like to create a grocery list? y/n");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        return user;
    }
    public static String PromptUser(){

        // need to figure out how to put input in here
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        return user;
    }
    public static String createItem(String UserInput, HashMap<String, ArrayList<GroceryItem>> addingItem){
        System.out.println("Select A  Category:");
        Map<String, ArrayList<GroceryItem>> addItem = addingItem;
        addItem.forEach(
                (key, value)-> System.out.println(key)
        );
                String category = PromptUser();
                return category;
    }

    public static void pickItem(String userInput, HashMap<String, ArrayList<GroceryItem>> GroceryStore){

        if(GroceryStore.containsKey(userInput)){
            ArrayList<GroceryItem> CategoryItems = GroceryStore.get(userInput);
            for(GroceryItem items : CategoryItems){
                System.out.println(items.getName());
            }
                System.out.println("Enter your new item:");
                String userInput3 = PromptUser();
                System.out.println("How many do you want:");
                String userInput4 = PromptUser();
                /////////////////////////////////////

                int userInt = Integer.parseInt(userInput4);
                CategoryItems.add(new GroceryItem(userInput3,userInt));

                System.out.printf("\nHere are your items in the %s Category: \n" , userInput);
                for(GroceryItem items : CategoryItems){
                    System.out.println("You have " + items.getNumItem()+ " " + items.getName() );
                }
            reDo(GroceryStore);

        } else {
            System.out.println("This is you shopping cart:");
//            We are converting a hashmap to a map
            Map<String, ArrayList<GroceryItem>> sorted = new TreeMap<>(GroceryStore);
//            Map<String, ArrayList<GroceryItem>> addItem = GroceryStore;
            for(Map.Entry<String, ArrayList<GroceryItem>> set: sorted.entrySet()){
                System.out.println("\n"+set.getKey()+":");
                ArrayList<GroceryItem> x = set.getValue();

                x.sort(Comparator.comparing(GroceryItem::getName));
//
                List<GroceryItem> xx = x;

                for(GroceryItem grocery: xx){
                    System.out.println(grocery.getName());
                }
            }
        }
            ;


//                ArrayList<GroceryItem> CategoryItems = GroceryStore.get(userInput);
//                for(GroceryItem items : CategoryItems){
//                    System.out.println(items.getName());
//                }
//            pickItem(userInput, GroceryStore);
        }



    public static void reDo(HashMap<String, ArrayList<GroceryItem>> GroceryStore){
        System.out.println("Would you like to add another item? y/n");
        String user2 = PromptUser();
        String userInput3 = ifYes2(user2,GroceryStore );
        pickItem(userInput3, GroceryStore);
    }

    public static void test(String userInput, HashMap<String, ArrayList<GroceryItem>> GroceryStore) {
        if (GroceryStore.containsKey(userInput)) {
            ArrayList<GroceryItem> CategoryItems = GroceryStore.get(userInput);
            for (GroceryItem items : CategoryItems) {
                System.out.println(items.getName());
            }
        }
    }

//    public static void stop(){
//        System.out.println("We are done");
//    }

    public static String ifYes(String user, HashMap<String, ArrayList<GroceryItem>> GroceryStore){
        if(user.equalsIgnoreCase("y") || user.equalsIgnoreCase("yes")){
            System.out.println("Would you like to add a new item? y/n");
            String UserInput = PromptUser();
            if(UserInput.equalsIgnoreCase("y") || UserInput.equalsIgnoreCase("yes"))
            return createItem(UserInput, GroceryStore);
        } else {
            return "";
        }
        return "";
    }

    public static String ifYes2(String user, HashMap<String, ArrayList<GroceryItem>> GroceryStore){
        if(user.equalsIgnoreCase("y") || user.equalsIgnoreCase("yes")){
                return createItem(user, GroceryStore);
        } else {
            return "";
        }
    }


    public static void main(String[] args) {
        /////////////////////////////////////////////////////
//        Getting data from Grocerylist
        HashMap<String, ArrayList<GroceryItem>> GroceryStore = new HashMap<>();
        GroceryStore = dataForGroceries();



        String user = PromptUserInt();
        String userInput2 = ifYes(user,GroceryStore );
        pickItem(userInput2, GroceryStore);
        System.out.println("");
//        test(userInput2, GroceryStore);
        ///////////////////////////////////////////////
//        System.out.println("Would you like to add another item? y/n");
//        String user2 = PromptUser();
//        String userInput3 = ifYes2(user2,GroceryStore );
//        pickItem(userInput3, GroceryStore);
//        System.out.println("");





//        String user = PromptUser();
//        GroceryItem Bread = new GroceryItem("Bread", 4);
//        System.out.println(Bread.getName() + Bread.getNumItem());


    }
}
