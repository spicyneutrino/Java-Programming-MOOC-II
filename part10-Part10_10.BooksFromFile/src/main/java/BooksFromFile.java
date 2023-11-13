
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    public static List<String> read(String file) {
        ArrayList<String> input = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(x -> input.add(x));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        return input;

    }

    public static List<Book> readBooks(String file){
        ArrayList<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).map(line->line.split(","))
        .filter(lineParts->lineParts.length==4).map(line-> new Book(line[0], Integer.valueOf(line[1]),  Integer.valueOf(line[2]), line[3])).forEach(book-> books.add(book));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getLocalizedMessage());
        }

        return books;
        
    }

}
