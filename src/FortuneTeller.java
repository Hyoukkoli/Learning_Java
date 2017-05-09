import java.io.*; //imports everything dealing with using files on the PC
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {

    public static void main(String[] args){

        File inputFile = new File("answers.txt");
        ArrayList<String> answers = new ArrayList<String>();
        String answer, response = "y";
        Random rand = new Random();
        try{
            Scanner input = new Scanner (inputFile);
            while (input.hasNextLine()){
                answer = input.nextLine();
                answers.add(answer);
            }
        }
        catch (Exception e){
            System.out.println("The input file \"answers.txt\" was not found.");
            System.out.println(e.toString());
            System.exit(0); //ends program because it can not be used (no file available = no fortune telling)
        }
        Scanner in = new Scanner(System.in);
        while (response.equalsIgnoreCase("y")){
            System.out.println("The fortune teller is ready for you \n"
            + "Please thinkg about yout question in your mind and hit enter for your reply.");
            in.nextLine();
            System.out.println("The fortune teller says: \"" + answers.get(rand.nextInt(answers.size()))+"\"\n");
            System.out.println("Do you have another question= (y/n)");
            response = in.nextLine();
        }

    }

}
