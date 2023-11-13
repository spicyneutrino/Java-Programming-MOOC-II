public class Book implements Packable{
    private String author, bookName;
    private double weight;

    public Book(String author, String bookName, double bookWeight){
        this.author = author;
        this.bookName = bookName;
        this.weight = bookWeight;
    }

    public double weight() {
        return this.weight;
    }
    @Override
    public String toString(){
        return this.author + ": " + this.bookName ;
    }
}
