package edu.neu.csye7374;
 
import java.util.ArrayList;
 
public class ClosedState implements RestaurantState {
    private ArrayList<MenuItem> menuItems;
 
    public ClosedState() {
        this.menuItems = new ArrayList<>();
    }
 
    @Override
    public void displayState() {
        System.out.println("Restaurant is currently Closed");
    }
 
    @Override
    public void displayMenu() {
        System.out.println("No Menu to display, Restaurant is Closed");
    }
 
    @Override
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}