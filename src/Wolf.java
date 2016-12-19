/**
 * Created by Yanni on 15.12.2016.
 */
public class Wolf extends Fleischfresser {
    public Wolf(String name, double gewicht, boolean lebendig, Zoo zoo) {
        super(name, gewicht, lebendig, zoo);
    }

    public void erlege(Tier beutetier) {
        if (beutetier.lebendig && lebendig && beutetier != this && zoo == beutetier.zoo) {
            beutetier.lebendig = false;
        }
        else {
            if (!beutetier.lebendig) {
                System.out.println("Das Beutetier ist schon tot.\n");
            }
            else if (!lebendig) {
                System.out.println("Nur lebendige Tiere koennen erlegen.\n");
            }
            else if (beutetier == this) {
                System.out.println("Ein Tier kann sich nicht selber erlegen.\n");
            }
            else {
                System.out.println("Die Tiere befinden sich nicht im gleichen Zoo.\n");
            }
        }
    }

    public String toString() {
        return "Tierart: Wolf" +super.toString();
    }
}
