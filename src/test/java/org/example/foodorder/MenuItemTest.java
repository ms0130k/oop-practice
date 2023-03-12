package org.example.foodorder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {
    @Test
    void 메뉴_생성() {
        assertThatCode(() -> new MenuItem("만두", 5000)).doesNotThrowAnyException();
    }
}
