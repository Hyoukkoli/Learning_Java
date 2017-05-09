public class ErrorHandling {

    public static void main(String[] args){
        int count = 0;
        int x= 5, y = 6, z = 7;

        //this block of code will try to run the code in try {}
        //if any kind of error/exception occurs, it will catch the error in catch {} and print it on the screen
        //this try-catch also lets the program end without any fuss
        //without the try-catch, the program would end abruptly and would return the error caused in the program
        try {
            double average = (x + y + z) / count;
            System.out.println("The average is: " + average);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }

}
