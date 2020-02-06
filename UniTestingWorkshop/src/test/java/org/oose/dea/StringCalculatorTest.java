package org.oose.dea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    @Test
    public void emptyString() {
        StringCalculator s = new StringCalculator();
        assertEquals(0, s.add(""));
    }

    @Test
    public void oneCharacterString() {
        StringCalculator s = new StringCalculator();
        assertEquals(1, s.add("1"));
        assertEquals(200, s.add("200"));
    }

    @Test
    public void multipleCharacterString() {
        StringCalculator s = new StringCalculator();
        assertEquals(9, s.add("1,8"));
        assertEquals(60, s.add("52,8"));
    }

    @Test
    public void randomAmountCharacterstring() {
        StringCalculator s = new StringCalculator();
        assertEquals(20, s.add("1,4,5,5,3,2"));
    }

    @Test
    public void inputWithEnter() {
        StringCalculator s = new StringCalculator();
        assertEquals(20, s.add("2\n18"));
        assertEquals(924, s.add("2\n900\n22"));
    }

    @Test
    public void inputGreaterTheThousand() {
        StringCalculator s = new StringCalculator();
        assertEquals(2, s.add("2,1001"));
        assertEquals(0, s.add("5000,2003"));
    }
}
