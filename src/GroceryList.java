import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    public static void main (String[] args){
        ArrayList<String> groceryList = new ArrayList<>(5);
        createList(groceryList);
    }

    public static void createList(ArrayList list){
        Scanner in = new Scanner (System.in);
        int length = 4;
        System.out.println("Please enter the name of the product.");
        String item = in.nextLine();
        list.add(item);
        for (int i = 0; i < length; i++){
            System.out.println("Please enter the name of the product.");
            item = in.nextLine();
            checkItem(item, list);
        }
        for (int i = 0; i <= length; i++){
            System.out.println(list.get(i) + "\t");
        }
    }

    //TO-DO: something is not working as planned: product is added even though it is in the ArrayList, later on ERROR

    public static void checkItem(String item, ArrayList list){
        Scanner in = new Scanner (System.in);
        int length = list.size();
        for (int i = 0; i < length; i++){
            String currentItem = (String)list.get(i);
            if (item.equalsIgnoreCase(currentItem) == true){
                System.out.println("This item is already on the list. Please enter the name of another product.");
                item = in.nextLine();
                checkItem(item, list);
                list.add(item);
            }
        }
    }
}
