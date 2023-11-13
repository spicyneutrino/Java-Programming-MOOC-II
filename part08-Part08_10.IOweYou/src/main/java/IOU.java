import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> owedList = new HashMap<>();

    public IOU() {

    }

    public void setSum(String toWhom, double amount) {
        this.owedList.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        if (this.owedList ==null || !this.owedList.containsKey(toWhom)) {
            return 0;
        }

        return this.owedList.get(toWhom);
    }

    public static void printValueIfNameContains(HashMap<String, Integer> hashmap, String text) {
        if (hashmap ==null || !hashmap.containsKey(text)) {
            return;
        }
        System.out.println(hashmap.get(text));

        // if (hashmap.keySet().toLowerCase().contains(text.toLowerCase())) {
        //     System.out.println(book);
        // }
    }
}
