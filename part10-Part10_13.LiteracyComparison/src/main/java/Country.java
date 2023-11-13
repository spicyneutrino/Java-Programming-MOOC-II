public class Country implements Comparable<Country>{
    private String country,gender;
    private int year;
    private double literacyRate;

    public Country(String country, int year, String gender, double literacyRate){
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.literacyRate = literacyRate;
    }

    public String getCountry() {
        return this.country;
    }

    public String getGender() {
        return this.gender;
    }

    public int getYear() {
        return this.year;
    }

    public double getLiteracyRate() {
        return this.literacyRate;
    }
    

    @Override
    public int compareTo(Country o) {
        return Double.compare(this.literacyRate, o.getLiteracyRate());
    }

    @Override
    public String toString() {
        return this.country + " ("+this.year+"), " + this.gender + ", " + this.literacyRate;
    }

    
    
}
