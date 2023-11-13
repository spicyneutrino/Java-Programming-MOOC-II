import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        double totalWeight = 0;
        if (!(this.items == null || this.items.isEmpty())) {
            for (Item itemEach : items) {
                totalWeight += itemEach.getWeight();
            }
        }
        if (item.getWeight()+totalWeight <= this.capacity){
            this.items.add(item);
        } else {
            return;
        }

    }

    @Override
    public boolean isInBox(Item item) {
        // TODO Auto-generated method stub
        if (items.contains(item)){
            return true;
        } else {
            return false;
        }
    }

}
