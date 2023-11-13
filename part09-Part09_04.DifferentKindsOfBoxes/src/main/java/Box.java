
import java.util.ArrayList;

public abstract class Box {

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        if (items==null || items.isEmpty()){
            return;
        }
        for (Item item : items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}
