package GroceryList;


import java.util.ArrayList;


public class Program {

    ArrayList <GroceryItems> groceryList = new ArrayList<GroceryItems>();
    GroceryItemsInputReader inputReader = new GroceryItemsInputReader();
    GroceryListChecker checkProduct = new GroceryListChecker();


    public void run(){
        GroceryItems item = inputReader.readItem();
        while (item != null){
            checkProduct.checkNames(item, groceryList);
            item = inputReader.readItem();
        }
        if (groceryList.size() == 0){
            System.out.println("Your grocery list is empty. Nothing will be printed and the program will stop.");
            System.exit(0);
        }
        System.out.println("Your grocery list contains " + groceryList.size() + " items.");
        printGroceryList(groceryList);
    }



    public static void printGroceryList(ArrayList<GroceryItems> list) {

        for (int i = 0; i < list.size(); i++) {
            GroceryItems product = list.get(i);
            System.out.println(product.getProductName() + "\t" + product.getSizeOfProduct() + "\t" + product.getType());
        }
    }
}
