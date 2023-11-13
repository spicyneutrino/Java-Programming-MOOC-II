public class Item {
    private String name;
    private int qty, unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.name = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.unitPrice * this.qty;
    }
    public void increaseQuantity(){
        this.qty++;
    }

    public String toString(){
        return this.name + ": " + this.qty;
    }
}
