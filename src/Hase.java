/**
 * Created by Yanni on 15.12.2016.
 */
public class Hase extends Pflanzenfresser {
    double ohrenlaenge;
    public Hase(String name, double gewicht, boolean lebendig, String lieblingsPflanze, double ohrenlaenge, Zoo zoo) {
        super(name, gewicht, lebendig, lieblingsPflanze, zoo);
        this.ohrenlaenge = ohrenlaenge;
    }

    public String toString() {
        return "Tierart: Hase\nOhrenlaenge: " +ohrenlaenge +super.toString();
    }
}
