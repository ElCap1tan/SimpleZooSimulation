import java.util.ArrayList;

/**
 * Created by yannwehn on 15.12.2016.
 */
public class Tierliste {
    ArrayList<Tier> arr = new ArrayList<>();

    public void add(Tier tier) {
        arr.add(tier);
    }

    public ArrayList<Tier> getList() {
        return arr;
    }
}
