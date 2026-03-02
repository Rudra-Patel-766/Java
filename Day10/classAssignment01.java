package Day10;

import java.util.*;

interface Taxable {
    double calculateTax();
}

abstract class Item implements Taxable {
    protected String itemID;
    protected String name;
    protected double basePrice;

    public Item(String itemID, String name, double basePrice) {
        this.itemID = itemID;
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getItemID() {
        return itemID;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract double getFinalPrice();

    public void display() {
        System.out.println("ID: " + itemID + ", Name: " + name + ", Base Price: $" + basePrice + ", Final Price (Incl. Tax): $" + getFinalPrice());
    }
}

class PerishableItem extends Item {
    private String expiryDate;

    public PerishableItem(String itemID, String name, double basePrice, String expiryDate) {
        super(itemID, name, basePrice);
        this.expiryDate = expiryDate;
    }

    public double calculateTax() {
        return basePrice * 0.05;
    }

    public double getFinalPrice() {
        return basePrice + calculateTax();
    }

    public void display() {
        super.display();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

class ElectronicItem extends Item {
    private int warrantyMonths;

    public ElectronicItem(String itemID, String name, double basePrice, int warrantyMonths) {
        super(itemID, name, basePrice);
        this.warrantyMonths = warrantyMonths;
    }

    public double calculateTax() {
        return basePrice * 0.15;
    }

    public double getFinalPrice() {
        return basePrice + calculateTax();
    }

    public void display() {
        super.display();
        System.out.println("Warranty: " + warrantyMonths + " months");
    }
}

public class classAssignment01 {

    public static void main(String[] args) {

        HashMap<String, Item> inventory = new HashMap<>();

        Item milk = new PerishableItem("P001", "Milk", 2.50, "2026-03-10");
        Item headphones = new ElectronicItem("E501", "Headphones", 120.00, 24);

        inventory.put(milk.getItemID(), milk);
        inventory.put(headphones.getItemID(), headphones);

        System.out.println("---- Inventory Items ----");
        for (Item item : inventory.values()) {
            item.display();
            System.out.println("----------------------");
        }

        String searchID = "P001";
        if (inventory.containsKey(searchID)) {
            System.out.println("Item Found:");
            inventory.get(searchID).display();
        }

        double total = 0;
        for (Item item : inventory.values()) {
            total += item.getFinalPrice();
        }

        System.out.println("\nTotal Inventory Value (Incl. Tax): $" + total);

        ArrayList<Item> sortedList = new ArrayList<>(inventory.values());
        sortedList.sort(Comparator.comparing(Item::getBasePrice));

        System.out.println("\n--- Items Sorted by Base Price ---");
        for (Item item : sortedList) {
            System.out.println(item.getItemID() + " - $" + item.getBasePrice());
        }
    }
}
