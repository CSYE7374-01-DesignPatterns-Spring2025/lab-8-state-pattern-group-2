package edu.neu.csye7374;
 
public class MenuItem {

    private int id;

    private String itemName;

    private double price;

    private String description;
 
    public MenuItem(int id, String itemName, double price, String description) {

        this.id = id;

        this.itemName = itemName;

        this.price = price;

        this.description = description;

    }
 
    public int getId() {

        return id;

    }
 
    public String getItemName() {

        return itemName;

    }
 
    public double getPrice() {

        return price;

    }
 
    public String getDescription() {

        return description;

    }
 
    @Override

    public String toString() {

        return id + "\t$" + String.format("%.2f", price) + "\t" + description;

    }

}
 
