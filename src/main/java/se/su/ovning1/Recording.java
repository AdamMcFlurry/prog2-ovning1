package se.su.ovning1;

public abstract class Recording implements PriceableWithVAT25 {
    private final String artist;
    private final int year;
    private int condition;
    private final double price;  // Utan moms

    protected Recording(String name, String artist, int year, int condition, double price) {
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
    public abstract String getType();

    protected double getOriginalPrice() {
        return price;
    }
    public double getPrice() {
        double conditionFactor = condition / 10.0;
        double adjustedPrice = price * conditionFactor;

        if (adjustedPrice < 10) {
            adjustedPrice = 10;
        }
        return adjustedPrice * 1.25;
    }
    @Override
    public String toString() {
        return getType() + "{ name=" + name + "artist=" + artist + "year=" + year + "condition=" + condition + "original price=" + getOriginalPrice() + "price=" + getPrice() + "price+VAT=" + getPriceWithVAT() + "}";
        // LP { name='Giant Steps', artist='John Coltrane', year=1959, condition=10, original price=100.0, price=425.0, price+VAT=531.25 }
    }
}

