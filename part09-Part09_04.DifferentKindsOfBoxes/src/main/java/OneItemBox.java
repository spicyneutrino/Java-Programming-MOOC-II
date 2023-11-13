import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        // TODO Auto-generated method stub
        if (this.items == null || this.items.isEmpty()) {
            this.items.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        // TODO Auto-generated method stub
        if (items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
}
