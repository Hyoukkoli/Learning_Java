import java.io.*;
import java.util.Scanner;

public class MenuList {

    public static void main(String[] args){

        File menuFile = new File("menu.txt");
        File newMenuFile = new File("newMenu.txt");
        Scanner in = new Scanner(System.in);
        String menuItem;
        String price;
        try {
            //input: Scanner gives us access to the content of the file menu.txt
            Scanner input = new Scanner(menuFile);
            //newMenu: PrintWriter allows us to write data into newMenu.txt
            PrintWriter newMenu = new PrintWriter(newMenuFile);
            while (input.hasNextLine()){
                menuItem = input.nextLine();
                System.out.println("Please enter the price for " +menuItem+ ".");
                price = in.nextLine();
                newMenu.println(menuItem + "\t" + price);
            }
            //IMPORTANT: close the file before ending the program!
            newMenu.close();

        }
        catch (Exception e){
            System.out.println(e.toString());
            System.exit(0);
        }

    }

}
