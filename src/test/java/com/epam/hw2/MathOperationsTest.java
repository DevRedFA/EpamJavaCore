package com.epam.hw2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {
    @Test
    void calculate() {
        assertEquals(MathOperations.calculate(MathOperations.operations[0],10,10), 20);
        assertEquals(MathOperations.calculate(MathOperations.operations[1],10,10), 1);
        assertEquals(MathOperations.calculate(MathOperations.operations[2],10,10), 0);
        assertEquals(MathOperations.calculate(MathOperations.operations[3],10,10), 100);
    }

}