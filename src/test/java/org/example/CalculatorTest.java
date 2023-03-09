package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 * MVC패턴(Model-View-Controller) 기반으로 구현한다.
 */
public class CalculatorTest {
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void 사칙연산(double operand1, double operand2, String operator, double result) {
        double calculateResult = Calculator.calculate(operand1, operand2, operator);
        assertThat(calculateResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1, 2, "+", 3),
                arguments(1, 2, "-", -1),
                arguments(1, 2, "*", 2),
                arguments(1, 2, "/", 0.5)
        );
    }

    @Test
    void 나누기0() {
        assertThatThrownBy(() -> Calculator.calculate(1, 0, "/")).isInstanceOf(IllegalArgumentException.class);
    }
}




