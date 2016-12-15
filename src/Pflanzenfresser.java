/**
 * Created by yannwehn on 15.12.2016.
 */
abstract public class Pflanzenfresser extends Tier{
    boolean geweih;
    String lieblingsPflanze;
    public Pflanzenfresser(String name, double gewicht, boolean lebendig, String lieblingsPflanze, Zoo zoo) {
        super(name, gewicht, lebendig, zoo);
        this.lieblingsPflanze = lieblingsPflanze;
    }

    public String toString() {
        return "\nLieblingspflanze: " +lieblingsPflanze +super.toString();
    }

}
