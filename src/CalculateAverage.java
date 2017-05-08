import java.util.Scanner;

public class CalculateAverage {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.println("Please enter three numbers to calculate the average.");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        System.out.println("The average of the entered numbers is: " +calculateAverage(a, b, c));


    }


    public static double calculateAverage(double a, double b, double c){
        return (a + b + c)/3;
    }


}
