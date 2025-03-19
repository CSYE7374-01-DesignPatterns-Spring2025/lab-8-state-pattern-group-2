package edu.neu.csye7374;
 
import java.util.ArrayList;
 
public class OpenState implements RestaurantState {

    private ArrayList<MenuItem> menuItems;
 
    public OpenState() {

        this.menuItems = new ArrayList<>();

    }
 
    @Override

    public void displayState() {

        System.out.println("Restaurant is Open, Choose a menu option");

    }
 
    @Override

    public void displayMenu() {

        System.out.println("No Menu to display, Choose a menu option");

    }
 
    @Override

    public ArrayList<MenuItem> getMenuItems() {

        return menuItems;

    }

}
 
