/**
 * Created by yannwehn on 15.12.2016.
 */
public class Reh extends Pflanzenfresser{
    boolean geweih;
    public Reh(String name, double gewicht, boolean lebendig, String lieblingsPflanze, boolean geweih, Zoo zoo) {
        super(name, gewicht, lebendig, lieblingsPflanze, zoo);
        this.geweih = geweih;
    }

    public String toString() {
        return "Tierart: Reh\nGeweih: " +geweih +super.toString();
    }
}
