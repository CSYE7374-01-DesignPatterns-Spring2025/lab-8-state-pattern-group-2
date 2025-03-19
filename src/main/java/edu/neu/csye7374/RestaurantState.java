package edu.neu.csye7374;

import java.util.ArrayList;

public interface RestaurantState {
    void displayState();
    void displayMenu();
    ArrayList<MenuItem> getMenuItems();
}
