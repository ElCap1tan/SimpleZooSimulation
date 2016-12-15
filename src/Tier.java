/**
 * Created by yannwehn on 15.12.2016.
 */
abstract public class Tier {
    double gewicht;
    String name;
    boolean lebendig;
    Zoo zoo;

    public Tier(String name, double gewicht, boolean lebendig, Zoo zoo) {
        this.gewicht = gewicht;
        this.name = name;
        this.lebendig = lebendig;
        this.zoo = zoo;
        zoo.nimmTierAuf(this);
    }

    public String toString() {
        return "\nName: " +name +"\nGewicht: " +gewicht +"\nLebendig: " +lebendig + "\nZoo: " +zoo +"\n";
    }
}
