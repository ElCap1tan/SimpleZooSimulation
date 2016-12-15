/**
 * Created by Yanni on 15.12.2016.
 */
public class Hyaene extends Fleischfresser{
    public Hyaene(String name, double gewicht, boolean lebendig, Zoo zoo) {
        super(name, gewicht, lebendig, zoo);
    }
    public String toString() {
        return "Tierart: Hyaene" +super.toString();
    }
}
