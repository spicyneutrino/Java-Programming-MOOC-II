import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> boxItems = new ArrayList<>();
    private double maxWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    public Box(Packable packable) {
        this.maxWeight = packable.weight();
    }

    public double weight() {
        if (boxItems == null || boxItems.isEmpty()) {
            return 0;
        }
        double totalWeight = 0;
        for (Packable item : this.boxItems) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() <= this.maxWeight) {
            boxItems.add(packable);
        }
    }

    public String toString() {
        return "Box: " + this.boxItems.size() + " items, total weight " + this.weight() + " kg";
    }
}
