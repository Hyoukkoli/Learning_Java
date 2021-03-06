package GroceryList;


import java.util.ArrayList;


public class Program {

    ArrayList<GroceryItems> groceryList = new ArrayList<GroceryItems>();
    GroceryItemsInputReader inputReader = new GroceryItemsInputReader();
    GroceryListChecker checkProduct = new GroceryListChecker();
    GroceryListPrintout printList = new GroceryListPrintout();


    public void run() {
        GroceryItems item = inputReader.readItem();
        while (item != null) {
            checkProduct.checkNames(item, groceryList);
            item = inputReader.readItem();
        }
        if (groceryList.size() == 0) {
            System.out.println("Your grocery list is empty. Nothing will be printed and the program will stop.");
            System.exit(0);
        }
        System.out.println("Your grocery list contains " + groceryList.size() + " items.");
        adjustProductValues(groceryList);
        printList.PrintGroceryList(groceryList);
    }


    public void adjustProductValues(ArrayList<GroceryItems> list) {
        for (int i = 0; i < list.size(); i++) {
            GroceryItems product = list.get(i);
            if (product.getSizeOfProduct() >= 1000) {
                if (product.getType() == GroceryItems.ProductType.GRAMS) {
                    product.setType(GroceryItems.ProductType.KILOGRAMS);
                    product.setSizeOfProduct(product.getSizeOfProduct() / 1000);
                } else if (product.getType() == GroceryItems.ProductType.MILLILITRE) {
                    product.setType(GroceryItems.ProductType.LITRE);
                    product.setSizeOfProduct(product.getSizeOfProduct() / 1000);
                }
            } else if ((product.getType() == GroceryItems.ProductType.PIECE) && (product.getSizeOfProduct() > 1)) {
                product.setType(GroceryItems.ProductType.PIECES);
            }
        }
    }



}
