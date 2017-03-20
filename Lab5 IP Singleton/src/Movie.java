/**
 * Created by Alex on 20-Mar-17.
 */
import java.util.Vector;

public class Movie {
    public Movie(String name) {
        Name = name;
        System.out.println("Obiect de tip film cu numele: "+Name);
    }

    public String Name;

    public String Category;

    public Ticket myTicket;
    public Program myProgram;

    public void getName() {
    }

    public void getCategory() {
    }

}
