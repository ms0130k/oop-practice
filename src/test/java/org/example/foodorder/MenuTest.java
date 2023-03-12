package org.example.foodorder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuTest {
    @Test
    void 메뉴항목_얻기() {
        Menu menu = new Menu(List.of(new MenuItem("돈가스", 5000), new MenuItem("만두", 7000), new MenuItem("냉면", 2000)));
        MenuItem menuItem = menu.choose("돈가스");
        assertThat(menuItem).isEqualTo(new MenuItem("돈가스", 5000));

    }

    @Test
    void 없는_메뉴_주문() {
        Menu menu = new Menu(List.of(new MenuItem("돈가스", 5000), new MenuItem("만두", 7000), new MenuItem("냉면", 2000)));
        assertThatCode(() -> menu.choose("고기"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(Menu.ILLEGAL_MENU_NAME);
    }
}
