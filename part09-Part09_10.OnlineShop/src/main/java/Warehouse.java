import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productMap = new HashMap<>();
    private Map<String, Integer> quantities = new HashMap<>();;

    public void addProduct(String product, int price, int stock) {
        productMap.put(product, price);
        quantities.put(product, stock);
    }

    public int price(String product) {
        for (String key : productMap.keySet()) {
            if (key.equals(product)) {
                return this.productMap.get(key);
            }
        }
        return -99;
    }

    public int stock(String product) {
        if (!this.productMap.containsKey(product)) {
            return 0;
        }
        return this.quantities.get(product);
    }

    public boolean take(String product){
        if (!this.quantities.containsKey(product)) {
            return false;
        }
        int quantity = this.quantities.get(product);
        if (quantity-1>=0){
            quantity--;
            quantities.put(product, quantity);
            return true;
        } else if (this.quantities.get(product)==0){
            return false;
        } else {
            return false;
        }
    }

    public Set<String> products(){
        //returns the names of the products in the warehouse as a Set
        Set<String> names = this.productMap.keySet();
        return names;
    }

}
