package com.telran;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvklidAlgorithmTest {

    EvklidAlgorithm div = new EvklidAlgorithm();

    @Test

    public void test_a48b12nod12() {
        assertEquals(12, div.gcd(48, 12));
    }
}