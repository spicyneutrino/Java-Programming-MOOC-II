import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum =0;
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number==0){
                break;
            }
            if(number<0){
                continue;
            }
            numbers.add(number);
        }
        if (numbers==null || numbers.isEmpty()){
            System.out.println("Cannot calculate the average");
        }
        
        for (int number : numbers){
            sum+=number;
        }
        double average = 1.0 * sum /numbers.size();
        System.out.println(average);
    }
}
