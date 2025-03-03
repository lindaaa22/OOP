import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String name;
    List <Movie> rentedMovies = new ArrayList<>();

    Viewer(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    Movie movie;
    void displayRentedMovies(){
        System.out.println(name + "'s rented Movies: ");
        for(Movie movie : rentedMovies){
            movie.printMovie();
            System.out.println("------------------------");

        }
    }
}
