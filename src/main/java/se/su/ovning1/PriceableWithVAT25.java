package se.su.ovning1;

public interface PriceableWithVAT25 {
    default double getVAT() {
        return 0.25;
    }
}
