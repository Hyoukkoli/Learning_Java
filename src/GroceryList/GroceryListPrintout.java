package GroceryList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class GroceryListPrintout {

    //prints the grocerylist, differenciates between products with amount and type and those without
    public void PrintGroceryList(ArrayList<GroceryItems> list) {
        int longestLength = returnLengthOfLongestAmountAndType(list);
        sortGroceryListByName(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getType() == GroceryItems.ProductType.EMPTY) {
                System.out.println(addWhitespace(list.get(i), longestLength) + " " + list.get(i).getProductName());
            } else {
                System.out.println(allignProduct(list.get(i), longestLength) + list.get(i).getSizeOfProduct() +
                        list.get(i).getEnding(list.get(i).getType()) + " " + list.get(i).getProductName());

            }
        }
    }

    //compares the names of the products and sorts them in descending order
    public void sortGroceryListByName(ArrayList<GroceryItems> list) {
        Collections.sort(list, new Comparator<GroceryItems>() {
            @Override
            public int compare(GroceryItems o1, GroceryItems o2) {
                return o1.getProductName().compareTo(o2.getProductName());
            }
        });
    }

    //creates the needed amount of whitespaces to align the current product it is used on
    public String allignProduct(GroceryItems item, int length) {
        String allignment = "";
        if (getLenghtOfAmountAndType(item) < length) {
            allignment = addWhitespace(item, length);
        }
        return allignment;
    }

    //function to create a String consisting of whitespaces (depending on current product)
    public String addWhitespace(GroceryItems item, int length) {
        if (item.getType() == GroceryItems.ProductType.EMPTY){
            StringBuilder whitespacesOnlyName = new StringBuilder();
            for (int i = 0; i < length; i++){
                whitespacesOnlyName.append(" ");
            }
            return whitespacesOnlyName.toString();
        }
        int neededWhitespace = length - getLenghtOfAmountAndType(item);
        StringBuilder whitespaces = new StringBuilder();
        for (int i = 0; i < neededWhitespace; i++) {
            whitespaces.append(" ");
        }
        return whitespaces.toString();
    }

    //calculates the length of the amount (if the amount were to be a string)
    public int getLengthOfAmount(double amount) {
        String amountInString = Double.toString(amount);
        int lengthOfAmount = amountInString.length();
        return lengthOfAmount;
    }


    //calculates the length of the type/its ending
    public int getLengthOfType(GroceryItems item) {
        String typeInString = item.getEnding(item.getType());
        int lengthOfString = typeInString.length();
        return lengthOfString;
    }

    //return the complete length of the amount and type-ending of a product
    public int getLenghtOfAmountAndType(GroceryItems item) {
        int completeLength = getLengthOfAmount(item.getSizeOfProduct()) + getLengthOfType(item);
        return completeLength;
    }

    //calculates the longest length of the amount and type-ending in the grocerylist by comparing the length of the current
    //product with the next product in the list
    public int returnLengthOfLongestAmountAndType(ArrayList<GroceryItems> list) {
        int lengthOfLongestAmountAndType = 0;
        for (int i = 0; i < list.size(); i++) {
            lengthOfLongestAmountAndType = getLenghtOfAmountAndType(list.get(i));
            try {
                if (lengthOfLongestAmountAndType < getLenghtOfAmountAndType(list.get(i + 1))) {
                    lengthOfLongestAmountAndType = getLenghtOfAmountAndType(list.get(i + 1));
                }
            } catch (Exception e) {
                return lengthOfLongestAmountAndType;
            }
        }
        return lengthOfLongestAmountAndType;
    }


}

