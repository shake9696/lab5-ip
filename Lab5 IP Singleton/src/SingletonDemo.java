/**
 * Created by Alex on 20-Mar-17.
 */
public class SingletonDemo {

    public static void main(String[] args) {
        Program tmp1 = Program.getInstance( );
        Program tmp2 = Program.getInstance( );

        Location oras = new Location("centru");
        Movie film = new Movie("filmbun");
        Ticket tichet = new Ticket(25);

        tmp1.setMovieTitle("Film1");
        tmp2.setMovieTitle("Film2");

        System.out.println(tmp1.getMovieTitle());
        System.out.println(tmp2.getMovieTitle());
    }
}