package org.example;

public class Main {
    public static void main(String[] args) {
        VegMenu vegOnly = new PureVegRestaurant();
        vegOnly.showVegMenu();

        NonVegMenu nonVeg = new NonVegRestaurant();
        nonVeg.showNonVegMenu();

        DrinksMenu drinks = new BarMenuRestaurant();
        drinks.showDrinksMenu();
    }
}