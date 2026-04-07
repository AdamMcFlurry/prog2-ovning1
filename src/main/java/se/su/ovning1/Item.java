package se.su.ovning1;

public class Item implements Priceable {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

// add, commit, push
