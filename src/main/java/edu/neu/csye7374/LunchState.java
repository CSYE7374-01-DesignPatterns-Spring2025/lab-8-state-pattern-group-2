package edu.neu.csye7374;

public class LunchState implements RestaurantState{

    @Override
    public void displayState() {
        System.out.println("Restaurant is currently Open and serving Lunch menu");
    }

    @Override
    public void displayMenu() {
        System.out.println("Lunch Menu:");
        System.out.println("ITEM\tPRICE\tDESCRIPTION");
        System.out.println("1\t$1.99\thot dog");
        System.out.println("2\t$2.99\tsalad");
        System.out.println("3\t$3.99\thamburger");
    }


}
