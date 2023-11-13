import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> map = new HashMap<>();
    private ArrayList<String> list = new ArrayList<>();

    public DictionaryOfManyTranslations() {

    }

    public void add(String word, String translation) {
        if (!this.map.containsKey(word)) {
            this.map.put(word, new ArrayList<>());
        }
        ArrayList<String> currentList = this.map.get(word);
        currentList.add(translation);

    }

    public ArrayList<String> translate(String word) {
        if (this.map.containsKey(word)) {
            return this.map.get(word);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String word) {
        if (this.map.containsKey(word)) {
            this.map.remove(word);
        }
    }

}
