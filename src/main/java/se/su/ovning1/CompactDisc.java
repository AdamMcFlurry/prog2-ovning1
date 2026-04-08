package se.su.ovning1;

public class CompactDisc extends Recording {
    private final String RECORDING_TYPE = "CD";

    public CompactDisc(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    @Override
    public String getType() {
        return RECORDING_TYPE;
    }
}