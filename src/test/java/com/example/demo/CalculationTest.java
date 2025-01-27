package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculationTest {

    @Test
    void testAdditionWorks() {
        int result = 1 + 1;
        assertEquals(2, result, "1 + 1 should equal 2");
    }
}