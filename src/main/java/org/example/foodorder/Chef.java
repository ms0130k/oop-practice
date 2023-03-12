package org.example.foodorder;

public class Chef {
    public Cook makeCook(final MenuItem menuItem) {
        return new Cook(menuItem);
    }
}
