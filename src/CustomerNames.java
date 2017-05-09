import java.io.*;
import java.util.Scanner;

//The file created in this class is saved in H:\Programmieren\Learning_Java
//Learning_Java is the home folder of the whole project and every Java class in it, so if no specific path is mentioned
//when creating or reading a file, the methods will automatically look into the Learning_Java folder, and not into
//its sub-folderes

public class CustomerNames {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        File output = new File("customers.txt");
        String name;
        System.out.println("Enter the first costumer name: ");
        name = in.nextLine();
        try{
            PrintWriter out = new PrintWriter(output); //PrintWriter used to create and/or write to files
            while (name.equalsIgnoreCase("done") == false){
                out.println(name);
                System.out.println("Enter the next name or \"done\" to exit.");
                name = in.nextLine();
            }
            out.close();
            //IMPORTANT: closes the PrintWriter file, all information added in this program will not be saved into
            // the file until .close() is executed
        }
        catch (Exception e){
            System.out.println("Error encountered " + e.toString());
        }
    }

}
