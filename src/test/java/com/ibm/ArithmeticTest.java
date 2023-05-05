package com.ibm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class ArithmeticTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testAdd() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(5, arithmetic.add(2, 3));
    }

    @Test
    void testSubtract() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(5, arithmetic.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(5, arithmetic.multiply(1, 5));
    }

    @Test
    void testDivide() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(5, arithmetic.divide(10, 2));
    }
}
