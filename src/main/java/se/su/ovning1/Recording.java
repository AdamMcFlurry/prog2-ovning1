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

    @Override
    public double getPrice() {
        return Math.max(10, price * condition / 10.0);
        // double conditionFactor = condition / 10.0;
        // double adjustedPrice = price * conditionFactor;

        // if (adjustedPrice < 10) {
        //     adjustedPrice = 10;
        // }
        // return adjustedPrice * 1.25;
    }

    protected double getOriginalPrice() { return price; }

    @Override
    public String toString() {
        return getType() + "{ name=" + getName() + "artist=" + artist + "year=" + year + "condition=" + condition + "original price=" + getOriginalPrice() + "price=" + getPrice() + "price+VAT=" + getPriceWithVAT() + "}";
        // LP { name='Giant Steps', artist='John Coltrane', year=1959, condition=10, original price=100.0, price=425.0, price+VAT=531.25 }
    }
}
