package GroceryList;

import java.util.ArrayList;

public class GroceryListChecker {


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

    private void checkType(GroceryItems newProduct, GroceryItems oldProduct){
        if (newProduct.getType() == oldProduct.getType()){
            addAmountToOldProduct(newProduct, oldProduct);
        } else {
            checkCompatibilityOfTypes(newProduct, oldProduct);
        }
    }

    private void addAmountToOldProduct(GroceryItems newProduct, GroceryItems oldProduct){
        oldProduct.setSizeOfProduct(oldProduct.getSizeOfProduct()+newProduct.getSizeOfProduct());
    }

    private void checkCompatibilityOfTypes(GroceryItems newProduct, GroceryItems oldProduct){
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

    private void matchAmount(GroceryItems newProduct, GroceryItems oldProduct){
        if (oldProduct.getType() == GroceryItems.ProductType.KILOGRAMS || oldProduct.getType() == GroceryItems.ProductType.LITRE) {
            oldProduct.setSizeOfProduct(oldProduct.getSizeOfProduct() * 1000);
        } else if (newProduct.getType() == GroceryItems.ProductType.KILOGRAMS || newProduct.getType() == GroceryItems.ProductType.LITRE){
            newProduct.setSizeOfProduct(newProduct.getSizeOfProduct() * 1000);
        } else if (newProduct.getType() == GroceryItems.ProductType.PIECE && oldProduct.getType() == GroceryItems.ProductType.PIECE){
            oldProduct.setType(GroceryItems.ProductType.PIECES);
            return;
        }
        addAmountToOldProduct(newProduct, oldProduct);
    }

}
