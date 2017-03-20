/**
 * Created by Alex on 20-Mar-17.
 */
public class Location {

    public Location(String name) {
        Name = name;
        System.out.println("Obiect de tip locatie cu numele: "+Name);
    }

    public String Name;

    public Program myProgram;

    public String getName() {
        return Name;
    }

}