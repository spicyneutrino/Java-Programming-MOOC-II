
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        Random randomObject = new Random();
        // boolean shouldContinue = true;
        int randomNumber=-1;

        for (int i = 0; i < 7; i++) {
            while (true){
                randomNumber = randomObject.nextInt(40) + 1;
                if (this.containsNumber(randomNumber)){
                    continue;
                } else {
                    this.numbers.add(randomNumber);
                    break;
                }
            }  
        }

        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (int eachNum : this.numbers) {
            if (eachNum == number) {
                return true;
            }
        }
        return false;
    }
}
