import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> herd = new ArrayList<>();
    
    public String toString(){
        String text = "";
        for(Movable organism:herd){
            text += organism.toString();
            text+="\n";
        }
        return text;
    }

    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        // TODO Auto-generated method stub
        for (Movable organism:herd){
            organism.move(dx, dy);
        }
    }
    
}
