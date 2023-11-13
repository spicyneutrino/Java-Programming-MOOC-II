
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();

        while (true){
            String eachLine = scanner.nextLine();

            if (eachLine.isEmpty()){
                break;
            }
            input.add(eachLine);
        }

        input.stream().forEach(x->System.out.println(x));

    }
}
