package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(5, service.add(2, 3));
    }
}
