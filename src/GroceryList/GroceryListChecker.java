package GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListChecker {

    Scanner in = new Scanner(System.in);

    //Method 1
    public ArrayList<GroceryItems> checkNames(GroceryItems newProduct, ArrayList<GroceryItems> list){
        String nameOfCurrentProduct = newProduct.getProductName();
        for (int i = 0; i < list.size(); i ++){
            if (nameOfCurrentProduct.equalsIgnoreCase(list.get(i).getProductName())){
                checkType(newProduct, list.get(i));
                return list;
            }
        }
        list.add(newProduct);
        return list;
    }

    //Method 2
    public void checkType(GroceryItems newProduct, GroceryItems oldProduct){
        if (newProduct.getType() == oldProduct.getType()){
            addAmountToOldProduct(newProduct, oldProduct);
        } else {
            checkCompatibilityOfTypes(newProduct, oldProduct);
        }
    }

    //Method 3
    public void addAmountToOldProduct(GroceryItems newProduct, GroceryItems oldProduct){
        oldProduct.setSizeOfProduct(oldProduct.getSizeOfProduct()+newProduct.getSizeOfProduct());
    }

    //Method 4
    public void checkCompatibilityOfTypes(GroceryItems newProduct, GroceryItems oldProduct){
        if ((newProduct.getType() == GroceryItems.ProductType.GRAMS && oldProduct.getType() == GroceryItems.ProductType.KILOGRAMS)
                || (newProduct.getType() == GroceryItems.ProductType.KILOGRAMS && oldProduct.getType() == GroceryItems.ProductType.GRAMS)
                || (newProduct.getType() == GroceryItems.ProductType.MILLILITRE && oldProduct.getType() == GroceryItems.ProductType.LITRE)
                || (newProduct.getType() == GroceryItems.ProductType.LITRE && oldProduct.getType() == GroceryItems.ProductType.MILLILITRE)
                || (newProduct.getType() == GroceryItems.ProductType.PIECE && oldProduct.getType() == GroceryItems.ProductType.PIECES)
                || (newProduct.getType() == GroceryItems.ProductType.PIECES && oldProduct.getType() == GroceryItems.ProductType.PIECE)
                || (newProduct.getType() == GroceryItems.ProductType.PIECE && oldProduct.getType() == GroceryItems.ProductType.PIECE)) {
            matchAmount(newProduct, oldProduct);
        }
    }

    //Method 5
    public void matchAmount(GroceryItems newProduct, GroceryItems oldProduct){
        if (oldProduct.getType() == GroceryItems.ProductType.KILOGRAMS || oldProduct.getType() == GroceryItems.ProductType.LITRE) {
            oldProduct.setSizeOfProduct(oldProduct.getSizeOfProduct() * 1000);
        } else if (newProduct.getType() == GroceryItems.ProductType.KILOGRAMS || newProduct.getType() == GroceryItems.ProductType.LITRE){
            newProduct.setSizeOfProduct(newProduct.getSizeOfProduct() * 1000);
        } else if (newProduct.getType() == GroceryItems.ProductType.PIECE && oldProduct.getType() == GroceryItems.ProductType.PIECE){
            oldProduct.setType(GroceryItems.ProductType.PIECES);
            return;
        }
        addAmountToOldProduct(newProduct, oldProduct);
        System.out.println("The old product and the new product had different types of amount. " +newProduct.getType() +
                " and " +oldProduct.getType() + ".\r\n");
        System.out.println("Do you want to change the type of the product to the type of the new one (into "
                + newProduct.getType() + ") or let it stay like it is (" + oldProduct.getType() + ")?\r\n " +
                "Please enter 'yes' for a change and 'no' for no change.");
        String answer = in.nextLine().trim().toLowerCase();
        if (answer.equalsIgnoreCase("yes")){
            oldProduct.setSizeOfProduct(oldProduct.getSizeOfProduct()/1000);
            oldProduct.setType(newProduct.getType());
        }
    }
}
