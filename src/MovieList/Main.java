package MovieList;
 import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String name, rating;
        int year, runtime;
        Movie movie;

        System.out.println("Please enter the name of the movie.");
        name = in.nextLine(); //IMPORTANT: in.next() only transfers the string input before the first space (e.g. "Tropic Thunder" with name = "Tropic")

        System.out.println("Please enter the rating of the movie.");
        rating = in.nextLine();

        System.out.println("Please enter the year the movie was released.");
        year = in.nextInt();

        System.out.println("Please enter the runtime of the movie in minutes.");
        runtime = in.nextInt();

        movie = new Movie(name, rating, year, runtime);
        System.out.println(movie.toString());




    }
}
