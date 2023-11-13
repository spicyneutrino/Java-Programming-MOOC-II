

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        String text = "17:23:05";
        String pattern = "[0-23]:[0-59]:[0-59]";
        if (text.matches(pattern)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
            
    }
}
