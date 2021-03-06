package org.oose.dea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
        assertEquals(100, calculator.add(25, 75));
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        assertEquals(100, calculator.minus(800, 700));
        assertEquals(7, calculator.minus(40, 33));
    }

    @Test
    public void testTimes() {
        Calculator calculator = new Calculator();
        assertEquals(50, calculator.times(10, 5));
        assertEquals(120, calculator.times(60, 2));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(3.3, calculator.divide(10, 3), 0.1);
        assertEquals(30, calculator.divide(120, 4));
    }

    @Test
    public void testDivideByzero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculator.divide(100, 0);
                });
    }
}