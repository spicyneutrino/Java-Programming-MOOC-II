
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // test your method here
        int[] numbers = { 8, -2, 3, 1, 1, 1, 2, 3 };
        System.out.println(sum(numbers, 5, numbers.length, 0, 999));

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        // check that the lower and the upper limit are valid indexes in the array.
        int lowerLimit = fromWhere, upperLimit = toWhere, sum = 0;
        if (fromWhere <= 0) {
            lowerLimit = 0;
        }
        if (toWhere >= array.length) {
            upperLimit = array.length - 1;
        }
        // sum
        for (int i=lowerLimit; i<=upperLimit;i++) {
            int num = array[i];
            if (num <= largest && num >= smallest) {
                sum += num;
            }
        }
        return sum;

    }

}
