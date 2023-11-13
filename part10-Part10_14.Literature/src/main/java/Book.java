import java.util.Comparator;

public class Book implements Comparable<Book>{
    private String name;
    private int age;

    public Book(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.age, o.getAge());
    }    
}