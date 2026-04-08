package se.su.ovning1;
import java.util.*;

public class Order {
    private static long counter = 0;
    private final long orderNumber;
    private final ArrayList<Item> items = new ArrayList<>();;
    
    //Konstruktorn
    public Order(Item... items) {
        this.orderNumber = ++counter;
        List<Item> itemsCollection = new ArrayList<>(List.of(items));
        this.items.addAll(itemsCollection);
        // for (Item item : items) {
        //     this.items.add(item);
        // }
    }

    //Metoder
    public String getReceipt() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Receipt for order #").append(orderNumber).append("\n");
        receipt.append("-----------").append("\n");
        for (Item item : items) {
            receipt.append(item.toString()).append("\n");
        }
        receipt.append("Total excl. VAT: ").append(getTotalValue()).append("\n");
        receipt.append("Total incl. VAT: ").append(getTotalValuePlusVAT()).append("\n");
        receipt.append("-----------");
        return receipt.toString();
    }

    public double getTotalValuePlusVAT() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPriceWithVAT();
        }
        return total;
    
    }
    public double getTotalValue(){
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    }
        

