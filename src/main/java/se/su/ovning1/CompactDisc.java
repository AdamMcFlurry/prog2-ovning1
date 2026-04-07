package se.su.ovning1;

public class CompactDisc extends Recording {
    private final String RECORDING_TYPE = "CD";
    private String artist;
    private int year;
    private int condition;
    private double price;

    public CompactDisc(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    public String getType() {
        return RECORDING_TYPE;
    }
}