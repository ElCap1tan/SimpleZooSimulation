import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;

/**
 * Created by yannwehn on 15.12.2016.
 */
abstract public class Fleischfresser extends Tier{
    boolean istJaeger = true;
    Tierliste magenInhalt = new Tierliste();

    public Fleischfresser(String name, double gewicht, boolean lebendig, Zoo zoo) {
        super(name, gewicht, lebendig, zoo);
    }

    public void friss(Tier beutetier) {
        if (beutetier != this && this.zoo == beutetier.zoo && !beutetier.lebendig && lebendig) {
            magenInhalt.add(beutetier);
            beutetier.zoo.loescheTier(beutetier);
            if (beutetier instanceof Fleischfresser) {
                System.out.println("Igitt igitt!\n");
            }
            else if (beutetier instanceof Pflanzenfresser) {
                System.out.println("Die Lieblingspflanze des Tiers ist " +((Pflanzenfresser) beutetier).lieblingsPflanze +"\n");
                if (beutetier.getClass() == Reh.class) {
                    if (((Pflanzenfresser) beutetier).geweih) {
                        System.out.println("Vorsicht! Spitzes Geweih!\n");
                    }
                    else {
                        System.out.println("Hmm... Schoen saftig\n");
                    }
                }
            }

        }
        else if(beutetier == this){
            System.out.println("Ein Beutetier kann sich nicht selbst fressen.\n");
        }
        else if (this.zoo != beutetier.zoo) {
            System.out.println("Die Beutetiere befinden sich nicht im selben Zoo.\n");
        }
        else if (beutetier.lebendig) {
            System.out.println("Das Beutetier ist lebendig.\n");
        }
        else if (!lebendig) {
            System.out.println("Nur lebende Tiere dürfen fressen.\n");
        }
    }

    public String magenInhalt() {
        String retString = "Gefressene Tiere: ";
        ArrayList<Tier> arr = magenInhalt.getList();
        for (Tier t:arr) {
            retString +="\n" +t.name;
        }
        retString+="\n";
        return retString;
    }

    public String toSting() {
        return "\nIst Jaeger?:  " +istJaeger +super.toString();
    }
}
