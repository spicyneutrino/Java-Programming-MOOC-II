public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history.add(initialBalance);
        super.addToWarehouse(initialBalance);
        // TODO Auto-generated constructor stub
    }

    public String history() {
        return this.history.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double left = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return left;
    }

    public void printAnalysis() {
        if (this.history != null) {
            System.out.println("Product: " + super.getName());
            System.out.println("History: " + this.history());
            System.out.println("Largest amount of product: " + this.history.maxValue());
            System.out.println("Smallest amount of product: " + this.history.minValue());
            System.out.println("Average: " + this.history.average());
        }
    }

}
