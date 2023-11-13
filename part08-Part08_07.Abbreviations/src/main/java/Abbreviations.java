import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> dict;

    public Abbreviations() {
        this.dict = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        
            this.dict.put(this.sanitizedString(abbreviation), this.sanitizedString(explanation));
        

    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.dict.containsKey(this.sanitizedString(abbreviation))) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation)){
            return this.dict.get(abbreviation);
        }
        return null;

    }

    public String sanitizedString(String word) {
        return word.toLowerCase().strip();
    }

}
