

public class Main {

    public static void main(String[] args) {
        // test your code here

        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    public int compare(Card o1, Card o2) {
        // TODO Auto-generated method stub
        return o1.compareTo(o2);
    }
}
