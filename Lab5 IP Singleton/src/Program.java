/**
 * Created by Alex on 20-Mar-17.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class Program {

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    private String movieTitle;
    private static Program instance = null;

    /* A private Constructor prevents any other
    * class from instantiating.
    */
    private Program() {
    }


    public String Data;

    public ArrayList Movies;

    public Array BookedHours;

    /**
     *
     * @element-type Movie
     */
    public Vector  myMovie;
    public Location myLocation;

    /* Static 'instance' method */
    public static Program getInstance() {
        if(instance == null) {
            instance = new Program();
        }
        return instance;
    }

    /* Other methods protected by singleton-ness */
    protected static void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }

    public void getData() {
    }

    public void getMovies() {
    }

}