package org.example.foodorder;

public class Customer {
    public void order(final String menuName, final Menu menu, final Chef chef) {
        MenuItem menuItem = menu.choose(menuName);
        chef.makeCook(menuItem);
    }
}
