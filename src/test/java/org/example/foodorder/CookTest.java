package org.example.foodorder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {
    @Test
    void 요리_생성() {
        assertThatCode(() -> new Cook("만두", 5000)).doesNotThrowAnyException();
    }
}
