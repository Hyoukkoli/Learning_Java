package GroceryList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>(5);
        createListNEW(groceryList);
        //createList(groceryList);
    }



    //TO-DO: add amount of entered product if it is already in the list

    public static void createListNEW(ArrayList list) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the name of the product.");
        String name = in.nextLine();
        System.out.println("Please enter the amount and the type of amount of the product (grams, kilograms, millilitre," +
                " litre, piece, pieces).");

        try {
            String stringAmount = in.next();
            double amount = Double.parseDouble(stringAmount);
            String ending = in.next();

            GroceryItems.ProductType type = checkAmountEnding(ending);
            GroceryItems product = new GroceryItems(name, amount, type);
            list.add(product);

            while (name.equalsIgnoreCase("n") != true) {
                System.out.println("Please enter a new product.");
                name = in.next();
                System.out.println("Please enter the amount and the type of amount of the product (grams, kilograms, millilitre," +
                        " litre, piece, pieces).");
                stringAmount = in.next();
                amount = Double.parseDouble(stringAmount);
                ending = in.next();

                type = checkAmountEnding(ending);
                product = new GroceryItems(name, amount, type);
                list.add(product);
                System.out.println("Do you wish to add another item? If no, enter 'n', else 'y'.");
                name = in.next();
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.println(product.getProductName() + " " + product.getSizeOfProduct() + type.getEnding(type));
            }

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("There seems to be an error when running the program. ");
            System.out.println("Please try again. ");
        }
    }


    public static GroceryItems.ProductType checkAmountEnding(String ending) {
        Scanner in = new Scanner(System.in);
        GroceryItems.ProductType type = null;
        ending = ending.toLowerCase();
        switch(ending){
            case "grams":
                type = GroceryItems.ProductType.GRAMS;
                return type;
            case "kilograms":
                type = GroceryItems.ProductType.KILOGRAMS;
                return type;
            case "millilitre":
                type = GroceryItems.ProductType.MILLILITRE;
                return type;
            case "litre":
                type = GroceryItems.ProductType.LITRE;
                return type;
            case "piece":
                type = GroceryItems.ProductType.PIECE;
                return type;
            case "pieces":
                type = GroceryItems.ProductType.PIECES;
                return type;
            default:
                System.out.println("The type of amount entered is not available. Please re-enter your input (grams, " +
                        "kilograms, millilitre, litre, piece, pieces).");
                String newEnding = in.next();
                return checkAmountEnding(newEnding);
        }

/*
        if (ending.equalsIgnoreCase("grams")) {
            type = GroceryItems.ProductType.GRAMS;
        } else if (ending.equalsIgnoreCase("kilograms")) {
            type = GroceryItems.ProductType.KILOGRAMS;
        } else if (ending.equalsIgnoreCase("millilitre")) {
            type = GroceryItems.ProductType.MILLILITRE;
        } else if (ending.equalsIgnoreCase("litre")) {
            type = GroceryItems.ProductType.LITRE;
        } else if (ending.equalsIgnoreCase("piece")) {
            type = GroceryItems.ProductType.PIECE;
        } else if (ending.equalsIgnoreCase("pieces")) {
            type = GroceryItems.ProductType.PIECES;
        } else {
            System.out.println("The type of amount entered is not available. Please re-enter your input (grams, " +
                    "kilograms, millilitre, litre, piece, pieces).");
            String newEnding = in.next();
            return checkAmountEnding(newEnding);
        }
        return type;
*/    }

}




/*OLD CODE
    public static void createList(ArrayList list){
        Scanner in = new Scanner (System.in);
        //entry for first product, no exit possible as it is the first item on the list (who has a grocery list with no
        // items on it?)
        System.out.println("Please enter the name of the product.");
        String item = in.nextLine();
        list.add(item);
        while (item.equalsIgnoreCase("exit") != true){
            System.out.println("Please enter the name of the product. If you do not want to add another item, type " +
                    "in 'exit'.");
            //possibility for exit entry as the grocery list could only contain one item
            item = in.nextLine();
            checkItem(item, list);
        }
        int length = list.size() - 1;
        for (int i = 0; i <= length; i++){
            System.out.println(list.get(i) + "\t");
        }
    }

    public static void checkItem(String item, ArrayList list) {
        int length = list.size();
        for (int i = 0; i < length; i++) {
            String currentItem = (String) list.get(i);
            if (item.equalsIgnoreCase(currentItem) == true) {
                System.out.println("This item is already on the list.");
                return;
            }
        }
        if (item.equalsIgnoreCase("exit") == false) {
            list.add(item);
        }
    }
}

*/