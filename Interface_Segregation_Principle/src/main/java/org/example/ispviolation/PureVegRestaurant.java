package org.example.ispviolation;

public class PureVegRestaurant implements RestaurantMenu {

    @Override
    public void showVegMenu() {
        System.out.println("Paneer Butter Masala");
    }

    @Override
    public void showNonVegMenu() {
        throw new UnsupportedOperationException("Non-veg not available");
    }

    @Override
    public void showDrinksMenu() {
        throw new UnsupportedOperationException("Drinks not available");
    }
}
