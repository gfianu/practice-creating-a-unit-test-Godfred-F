package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgeCalculatorTest {
    @Test
    public void testYearsUntil100Typical() {
        assertEquals(70, AgeCalculator.yearsUntil100(30));
    }

    @Test
    public void testYearsUntil100Already100() {
        assertEquals(0, AgeCalculator.yearsUntil100(100));
    }

    @Test
    public void testYearsUntil100Over100() {
        assertEquals(-5, AgeCalculator.yearsUntil100(105));
    }
}
