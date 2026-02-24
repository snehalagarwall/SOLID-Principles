package org.example;

public class BarMenuRestaurant implements VegMenu,NonVegMenu,DrinksMenu{
    @Override
    public void showVegMenu() {
        System.out.println("Veg Manchurian");
    }

    @Override
    public void showNonVegMenu() {
        System.out.println("Mutton Curry");
    }

    @Override
    public void showDrinksMenu() {
        System.out.println("Mojito");
        System.out.println("Beer");
    }
}
