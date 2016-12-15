import java.util.ArrayList;

/**
 * Created by yannwehn on 15.12.2016.
 */
public class Zoo {
    ArrayList<Tier> tierListe = new ArrayList<>();
    String name;
    public Zoo(String name) {
        this.name = name;
    }

    public boolean nimmTierAuf(Tier zootier) {
        if (!tierListe.contains(zootier)) {
            tierListe.add(zootier);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean loescheTier(Tier opfer) {
        if (tierListe.contains(opfer)) {
            tierListe.remove(opfer);
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
       String returnString = "Zooname: " +name +"\nListe aller Tiere: ";
       for (Tier t:tierListe) {
           returnString +="\n" +t.name;
       }
       returnString+="\n";
       return returnString;
    }
}
