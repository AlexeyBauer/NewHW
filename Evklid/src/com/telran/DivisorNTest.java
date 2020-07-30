package com.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DivisorNTest {

DivisorN multiply = new DivisorN();

@Test

public void testNumber_33(){
    List<Integer> toTest = Arrays.asList(1,3,8,9,9,11,20);
    assertTrue(multiply.isDevided(toTest, 33));
}
}