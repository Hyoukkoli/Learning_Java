import java.util.Scanner;

public class CalculateShipping {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double cost;

        System.out.println("Please enter the total cost of your shopping cart.");
        cost = in.nextDouble();

        if (cost >= 75){
            System.out.println("The shipping is free! Your total costs are: $" +cost);
        } else if (cost >= 50){
            System.out.println("The shipping fee for your order is $5. Your total cost is: $" + (cost + 5.00));
        } else if (cost >= 25){
            System.out.println("The shipping fee for your order is $10. Your total cost is: $" + (cost + 10.00));
        } else if (cost < 25){
            System.out.println("The shipping fee for your order is $15. Your total cost is: $" + (cost + 15.00));
        }

    }



}
