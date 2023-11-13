import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand = new ArrayList<>();

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int getValueSum() {
        int sumValue = 0;
        for (Card card : hand) {
            sumValue += card.getValue();
        }
        return sumValue;
    }

    @Override
    public int compareTo(Hand o) {
        // TODO Auto-generated method stub
        if (this.getValueSum() < o.getValueSum()) {
            return -1;
        } else if (this.getValueSum() > o.getValueSum()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void sortBySuit(){
        Collections.sort(this.hand,new BySuitInValueOrder());
    }

    
}
