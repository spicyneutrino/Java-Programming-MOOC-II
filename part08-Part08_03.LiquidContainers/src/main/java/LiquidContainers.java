
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.getVolume() + "/100");
            System.out.println("Second: " + second.getVolume() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputParts = input.split(" ");
            int amount = Integer.valueOf(inputParts[1]);

            switch(inputParts[0]){
                case "add":
                    first.add(amount);
                    break;
                case "move":
                    first.moveTo(second, amount);
                    break;
                case "remove":
                    second.remove(amount);
                    break;
                default:
                    continue;
            }

        }
    }

}
