import java.util.Scanner;

public class CalculateHouseSize {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        double lengthHouse;
        double widthHouse;
        double heightHouse;

        int numberOfWindows;
        double lengthWindow;
        double heightWindow;

        int numberOfDoors;
        double lengthDoor;
        double heightDoor;

        System.out.println("Enter the length, width, and height of your house.");
        lengthHouse = in.nextDouble();
        widthHouse = in.nextDouble();
        heightHouse = in.nextDouble();

        System.out.println("Enter the number and the length and size of your windows separately.");
        numberOfWindows = in.nextInt();
        lengthWindow = in.nextDouble();
        heightWindow = in.nextDouble();

        System.out.println("Enter the number and the length and height of your doors separately.");
        numberOfDoors = in.nextInt();
        lengthDoor = in.nextDouble();
        heightDoor = in.nextDouble();

        System.out.println("The area of the house that can be painted is: " +((lengthHouse * heightHouse * 2 + widthHouse
                * heightHouse * 2) - (lengthDoor * heightDoor * numberOfDoors) - (lengthWindow * heightWindow *
                numberOfWindows)) );

    }

}
