package edu.neu.csye7374;

import java.awt.*;
import java.util.ArrayList;

public class DinnerState implements RestaurantState {
    private ArrayList<MenuItem> menuItems;

    public DinnerState() {
        this.menuItems = new ArrayList<>();
        // Initialize dinner menu items
        menuItems.add(new MenuItem(1, "Soup", 11.99, "soup"));
        menuItems.add(new MenuItem(2, "Salad", 12.99, "salad"));
        menuItems.add(new MenuItem(3, "Steak", 13.99, "steak"));
        // Add optional items as mentioned in the lab requirements
        menuItems.add(new MenuItem(4, "Salmon", 14.99, "salmon"));
        menuItems.add(new MenuItem(5, "Chicken", 15.99, "chicken"));
    }

    @Override
    public void displayState() {
        System.out.println("Restaurant is currently Open and serving Dinner menu");
    }

    @Override
    public void displayMenu() {
        System.out.println("Dinner Menu:");
        System.out.println("ITEM\tPRICE\tDESCRIPTION");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }

    @Override
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}