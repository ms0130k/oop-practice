package org.example.foodorder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChefTest {
    @Test
    void 음식_만들기() {
        Chef chef = new Chef();
        MenuItem menuItem = new MenuItem("만두", 5000);
        Cook cook = chef.makeCook(menuItem);
        assertThat(cook).isEqualTo(new Cook("만두", 5000));

    }
}
