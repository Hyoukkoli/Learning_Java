//Exercise for two dimensional arrays: creating an 2D array to calculate the 30% discount of a specific poduct

import java.util.Scanner;

public class Prices {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        double [][] prices = new double[5][2]; //first column: original price, second column: discount price

        for (int i = 0; i < 5; i++){
            System.out.println("Enter the original price of the product:");
            prices[i][0] = in.nextDouble();
            prices[i][1] = prices[i][0] * 0.70;
        }

        for (int i = 0; i < 5; i ++){
            System.out.println("The original price: $" + prices[i][0] + "\tThe discount price: $" +prices[i][1]);
        }
    }

}
