package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6 {
    private String author;
    private double price;
    private boolean bound;
    
    public Book(String name, String author, double price, boolean bound) {
        super(name);
        this.author = author;
    }

    public int getPrice() {

    }

    @Override
    public String toString() {

    }

}
