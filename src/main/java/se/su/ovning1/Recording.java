package se.su.ovning1;

public abstract class Recording implements PriceableWithVAT25{
    protected String name;
    protected String artist;
    protected int year;
    protected int condition;
    protected double price;  // Utan moms

    public Recording(String name, String artist, int year, int condition, double price) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }
    public abstract String getType();

    public String getArtist() {
        return artist;
    }
    public int getYear() {
        return year;
    }
    public int getCondition() {
        return condition;
    }
    public double getPrice() {
        double conditionFactor = condition / 10.0;
        double adjustedPrice = price * conditionFactor;

        if (adjustedPrice < 10) {
            adjustedPrice = 10;
        }
        return adjustedPrice * 1.25;
    }
}
