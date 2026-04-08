package se.su.ovning1;

public class LongPlay extends Recording {
    private final String RECORDING_TYPE = "LP";

    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    @Override
    public String getType() {
        return RECORDING_TYPE;
    }

    @Override
    public double getPrice() {
       return (super.getPrice() + (2025 - 2020) * 5);
    }



}
