package com.example.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorParameterizedTest {
    private final CalculatorService service = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "5, 5, 10",
        "-1, 1, 0"
    })
    void testAdd(int a, int b, int expected) {
        assertEquals(expected, service.add(a, b));
    }
}
