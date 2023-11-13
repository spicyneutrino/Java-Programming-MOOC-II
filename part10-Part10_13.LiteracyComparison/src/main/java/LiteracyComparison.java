import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Country> countryData = new ArrayList<>();
        // Adult literacy rate, population 15+ years, female (%),Zimbabwe,2015,85.28513

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .forEach(lineSplit -> countryData.add(new Country(lineSplit[3], Integer.valueOf(lineSplit[4]),
                            lineSplit[2].trim().split(" ")[0], Double.valueOf(lineSplit[5]))));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Collections.sort(countryData);
        countryData.stream().forEach(line->System.out.println(line));
    }
}
