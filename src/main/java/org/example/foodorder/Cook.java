package org.example.foodorder;

import java.util.Objects;

public class Cook {
    private String name;
    private int price;

    public Cook(final MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cook cook = (Cook) o;
        return price == cook.price && Objects.equals(name, cook.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public Cook(final String name, final int price) {
        this.name = name;
        this.price = price;
    }
}
