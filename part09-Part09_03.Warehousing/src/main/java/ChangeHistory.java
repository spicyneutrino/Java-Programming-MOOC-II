import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history = new ArrayList<>();
    }
    public String toString(){
        String text = this.history.toString();
        return text;
    }
    public double maxValue(){
        if (this.history==null || this.history.isEmpty()){
            return 0;
        }
        Double max = Collections.max(this.history);
        return max;
    }
    public double minValue(){
        if (this.history==null || this.history.isEmpty()){
            return 0;
        }
        Double max = Collections.min(this.history);
        return max;
    }
    public double average(){
        if (this.history==null || this.history.isEmpty()){
            return 0;
        }
        double sum = 0,avg=0;
        for(Double data : history){
            sum+=data;
        }
        avg = 1.0* sum/this.history.size();
        return avg;
    }
    
}
