package se.su.ovning1

public class Order extends Item {
    private long orderNumber;
    private long counter;
    private List<Item> items;
    //Konstruktorn
    public Order(long orderNumber, long counter) {
        this.orderNumber = orderNumber;
        this.counter = counter;
        this.items = new ArrayList<>();
    }
    //Metoder
public String getReceipt() {
    StringBuilder receipt = new StringBuilder();
    receipt.append("Order Number: ").append(orderNumber).append("\n");
    receipt.append("Counter: ").append(counter).append("\n");
    receipt.append("Items:\n");
    for (Item item : items) {
        receipt.append("- ").append(item.getName()).append(": $").append(item.getPrice()).append("\n");
    }
    return receipt.toString();
}

public double getTotalValuePlusVAT() {
    double total = 0.0;
    for (Item item : items) {
        total += item.getPrice();
    }
    return total; //här kan man behöva lägga till VAT men förstår ej hur.
   
}
public double getTotalValue(){
    double total = 0.0;
    for (Item item : items) {
        total += item.getPrice();
    }
    return total;
}
}
    

