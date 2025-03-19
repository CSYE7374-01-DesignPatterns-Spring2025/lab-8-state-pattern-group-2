package edu.neu.csye7374;

public class DinnerState implements RestaurantState{

    @Override
    public void displayState() {
        System.out.println("Restaurant is currently Open and serving Dinner menu");
    }

    @Override
    public void displayMenu() {
        System.out.println("Dinner Menu:");
        System.out.println("ITEM\tPRICE\tDESCRIPTION");
        System.out.println("1\t$11.99\tsoup");
        System.out.println("2\t$12.99\tsalad");
        System.out.println("3\t$13.99\tsteak");
    }

}
