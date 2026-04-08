package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {
    protected final String artist;
    protected final int year;
    protected int condition;
    protected final double price;  // Utan moms

    public Recording(String name, String artist, int year, int condition, double price) {
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }
    public int getYear() {
        return year;
    }

    public int getCondition() {
        return condition;
    }

    @Override
    public double getPrice() {
        //return MATH.max10, price * condition / 10.0);
        double conditionFactor = condition / 10.0;
        double adjustedPrice = price * conditionFactor;

        if (adjustedPrice < 10) {
            adjustedPrice = 10;
        }
        return adjustedPrice * 1.25;
    }

    public double getOriginalPrice() { return price; }

    //toString
}

