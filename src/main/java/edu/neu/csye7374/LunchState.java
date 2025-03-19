package edu.neu.csye7374;

import java.util.ArrayList;

public class LunchState implements RestaurantState {
    private ArrayList<MenuItem> menuItems;

    public LunchState() {
        this.menuItems = new ArrayList<>();
        // Initialize lunch menu items
        menuItems.add(new MenuItem(1, "Hot Dog", 1.99, "hot dog"));
        menuItems.add(new MenuItem(2, "Salad", 2.99, "salad"));
        menuItems.add(new MenuItem(3, "Hamburger", 3.99, "hamburger"));
    }

    @Override
    public void displayState() {
        System.out.println("Restaurant is currently Open and serving Lunch menu");
    }

    @Override
    public void displayMenu() {
        System.out.println("Lunch Menu:");
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
