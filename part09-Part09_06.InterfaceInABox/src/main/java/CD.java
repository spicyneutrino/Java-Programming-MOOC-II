public class CD implements Packable {
    private String artist, CDName;
    private int PublicationYear;
    private double weight;

    public CD(String artist, String CDName, int PublicationYear) {
        this.artist = artist;
        this.CDName = CDName;
        this.PublicationYear = PublicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.CDName + " (" + this.PublicationYear + ")";
    }
}
