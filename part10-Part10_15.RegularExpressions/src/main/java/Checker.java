
public class Checker {

    public boolean isDayOfWeek(String string) {
        String pattern = "sun|mon|tue|wed|thu|fri|sat";
        if (string.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean allVowels(String string) {
        String pattern = "[aeiou]+";
        if (string.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean timeOfDay(String string) {
        String pattern = "[0-23]:[0-59]:[0-59]";
        if (string.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }
}
