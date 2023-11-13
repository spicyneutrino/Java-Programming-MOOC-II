
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.net.ssl.SSLKeyException;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(name, age));

        }
        Collections.sort(bookList);

        Collections.sort(bookList, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                // TODO Auto-generated method stub
                if(o1.getAge() == o2.getAge()){
                    return  o1.getName().compareTo(o2.getName());
                }
                return Integer.compare(o1.getAge(), o1.getAge());
            }
        });
        
        System.out.println(bookList.size() + " books in total.");
        System.out.println("Books:");

        bookList.stream().forEach(book -> System.out.println(book));

    }

}
