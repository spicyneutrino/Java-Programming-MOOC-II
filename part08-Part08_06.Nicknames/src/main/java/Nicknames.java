
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String,String> nickname = new HashMap<>();
        nickname.put("Matthew", "matt");
        nickname.put("Michael", "mix");
        nickname.put("Arthur", "artie");

        System.out.println(nickname.get("Matthew"));
        
    }

}
