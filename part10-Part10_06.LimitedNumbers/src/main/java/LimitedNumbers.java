
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();

        while(true){
            int line = Integer.valueOf(scanner.nextLine());

            if (line == -1){
                break;
            }
            input.add(line);
        }

        input.stream().filter(num-> num>=1&& num<=5).forEach(x->System.out.println(x));
    }
}
