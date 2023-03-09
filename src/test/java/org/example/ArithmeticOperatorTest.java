package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ArithmeticOperatorTest {

    @Test
    void values() {
        assertThat(ArithmeticOperator.values().length).isEqualTo(4);
        assertThat(ArithmeticOperator.values()).isInstanceOf(ArithmeticOperator[].class);
    }

    @Test
    void 계산() {
        assertThat(Arrays.stream(ArithmeticOperator.values()).filter(v -> v.getOperator().equals("+")).count()).isEqualTo(1);
        assertThat(Arrays.stream(ArithmeticOperator.values()).filter(v -> v.getOperator().equals("+")).findFirst().get().calculate(1, 2)).isEqualTo(3);
    }
}