package MovieList;

public class Movie{

    private String movieName;
    private String ageRating;
    private int releaseYear;
    private int runtimeInMinutes;


    public Movie(String name, String rating, int year, int runtime){
        movieName = name;
        ageRating = rating;
        releaseYear = year;
        runtimeInMinutes = runtime;
    }

    public String getMovieName(){
        return this.movieName;
    }
    public void setMovieName(String name){
        movieName = name;
    }

    public String getAgeRating(){
        return this.ageRating;
    }
    public void setAgeRating(String rating){
        ageRating = rating;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }
    public void setReleaseYear(int year){
        releaseYear = year;
    }

    public int getRuntimeInMinutes(){
        return this.runtimeInMinutes;
    }
    public void setRuntimeInMinutes(int runtime){
        runtimeInMinutes = runtime;
    }

    public String toString(){
        return "Movie name: " + this.movieName + "\nRating of the movie: " + this.ageRating + "\nYear of the release: "
                + this.releaseYear + "\nRuntime in minutes: " + this.runtimeInMinutes;
    }
}
