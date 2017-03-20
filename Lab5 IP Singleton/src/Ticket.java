/**
 * Created by Alex on 20-Mar-17.
 */
public class Ticket {
    public Ticket(Integer price) {
        Price = price;
        System.out.println("Obiect de tip tichet cu pretul: "+Price);
    }

    public Integer Price;

    public String Category;

    public Movie myMovie;

    public void getPrice() {
    }

    public void getCategory() {
    }

}
