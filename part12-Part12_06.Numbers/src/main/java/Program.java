
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomObject = new Random();

        System.out.println("How many random numbers should be printed? ");
        int frequency =  scanner.nextInt();

        for (int i=0;i<frequency;i++){
            System.out.println(randomObject.nextInt(11));
        }


    }

}
