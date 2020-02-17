
package org.oose.dea;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setCustomcalculation((x, y) -> {
            return 2 * y + x;
        });

        System.out.println(calculator.performCustomcalculation(5, 6));
    }

    private CustomCalculation customCalculation;

    public int add(int value1, int value2) {
        return value1 + value2;
    }

    public int minus(int value1, int value2) {
        return value1 - value2;
    }

    public int times(int value1, int value2) {
        return value1 * value2;
    }

    public double divide(double value1, double value2) {
        if (value2 == 0) {
            throw new IllegalArgumentException("Dit mag niet");
        }
        return value1 / value2;
    }

    public int performCustomcalculation(int x, int y) {
        return customCalculation.calculate(x, y);
    }

    public void setCustomcalculation(CustomCalculation calculation) {
        this.customCalculation = calculation;
    }
}