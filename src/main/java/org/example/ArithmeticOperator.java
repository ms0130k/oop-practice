package org.example;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADDITION("+") {
        @Override
        public double calculate(final double operand1, final double operand2) {
            return operand1 + operand2;
        }
    }, SUBTRACTION("-") {
        @Override
        public double calculate(final double operand1, final double operand2) {
            return operand1 - operand2;
        }
    }, MULTIPLICATION("*") {
        @Override
        public double calculate(final double operand1, final double operand2) {
            return operand1 * operand2;
        }
    }, DIVISION("/") {
        @Override
        public double calculate(final double operand1, final double operand2) {
            if (operand2 == 0) {
                throw new IllegalArgumentException(Calculator.CANNOT_DIVIDE_0);
            }
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithmeticOperator(final String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public abstract double calculate(double operand1, double operand2);

    public static double calculate(double operand1, double operand2, String operator) {
        return Arrays.stream(ArithmeticOperator.values())
                .filter(v -> v.getOperator().equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(Calculator.IS_NOT_ARITHMETIC_OPERATOR))
                .calculate(operand1, operand2);
    }
}
