
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> inputs = new ArrayList<>();
        boolean isP = false, isN = false;

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        try {
             // average of positive nums
            double p = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble();

            // average of negative nums
            double n = inputs.stream()
                    .mapToInt(num -> Integer.valueOf(num))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();

            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            String response = scanner.nextLine();

            if (response.equals("p")) {
                System.out.println("Average of the positive numbers: " + p);
            }
            if (response.equals("n")) {
                System.out.println("Average of the negative numbers: " + n);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       

    }
}
