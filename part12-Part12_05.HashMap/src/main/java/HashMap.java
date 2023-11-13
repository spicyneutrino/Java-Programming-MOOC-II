import java.util.ArrayList;

public class HashMap<K,V>{
    
    private ArrayList<Pair<K,V>> values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new ArrayList<>();
        this.firstFreeIndex =0;
    }

    // public V get(K key){
    //     int hashValue = Math.abs(key.hashCode() % this.values.size());
    //     if (this.values.get(hashValue) == null) {
    //         return null;
    //     }
    //     Re

    //     // Pair<K,V>> valuesAtIndex = this.values.get(hashValue);
    // }

    
}