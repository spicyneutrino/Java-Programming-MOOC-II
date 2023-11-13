import java.util.ArrayList;

public class Pipe<T> {
    ArrayList<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    public T takeFromPipe(){
        if (!isInPipe()){
            return null;
        }
        T firstItem = this.pipe.get(0);
        this.pipe.remove(0);
        return firstItem;
    }

    public boolean isInPipe(){
        return !this.pipe.isEmpty();
        // empty list and null list (not initialized) are different
    }
    
}
