package org.example;

public class NonVegRestaurant implements VegMenu,NonVegMenu{

    @Override
    public void showVegMenu() {
        System.out.println("Veg Fried Rice");
    }

    @Override
    public void showNonVegMenu() {
        System.out.println("Chicken Biryani");
    }
}
