import java.util.Scanner;

public class HeightStudents {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Please enter the number of the students in this class.");
        int number = in.nextInt();

        double[] studentList = new double[number];

        for (int i = 0; i < number; i++){
            System.out.println("Please enter the height of the student.");
            studentList[i] = in.nextDouble();
        }

        //code to return the height of the tallest student in the list
        double highestHeight = studentList[0];
        for (int i = 1; i < number; i++){
            if (highestHeight < studentList[i]){
                highestHeight = studentList[i];
            }
        }
        System.out.println("The height of the tallest student is: "+highestHeight);

        //code to calculate and return the average height of the students in the list
        double totalHeight = 0;
        for (int i = 0; i < number; i++){
            //totalHeight = totalHeight + studentList[i];

            //same thing as totalHeight = totalHeight + studentList[i];
            totalHeight += studentList[i];
        }
        System.out.println("The average height of the students in the list is: " + (totalHeight / number));

    }


}
