import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage = new HashMap<>();

    public void add(String unit, String item) {
        ArrayList<String> currentContents = new ArrayList<>();
        if (!storage.containsKey(item)) {
            storage.put(unit, currentContents);
        }
        // currentContents = storage.get(unit);
        currentContents.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.containsKey(storageUnit)) {
            return this.storage.get(storageUnit);
        }

        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item){
        //first get the specified units's value pair
        //second get that value pair(arraylist)'s item from a specified index
        //specified index is index of the item in that arraylist
        if(this.storage.containsKey(item) && !this.storage.get(item).isEmpty() ){
            ArrayList<String> currentItems = this.storage.get(item);
            int index = currentItems.indexOf(storageUnit);
            currentItems.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> temp = new ArrayList<>();
        for (String item : this.storage.keySet()) {
            if (!item.equals(null)) {
                temp.add(item);
            }
        }
        return temp;
    }
}
