package org.example.foodorder;

import java.util.List;

public class Menu {
    public static final String ILLEGAL_MENU_NAME = "잘못된 메뉴 이름입니다.";
    private List<MenuItem> menuItems;

    public Menu(final List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem choose(final String menuName) {
        return menuItems.stream()
                .filter(menuItem -> menuItem.matches(menuName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ILLEGAL_MENU_NAME));
    }
}
