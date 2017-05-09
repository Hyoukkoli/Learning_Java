import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    public static void main (String[] args){
        ArrayList<String> groceryList = new ArrayList<>(5);
        createList(groceryList);
    }

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
