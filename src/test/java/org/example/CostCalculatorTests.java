package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CostCalculatorTests {

    @Test
    void testCalculateCost1() {
        int result = CostCalculator.calculateCost(true, 12);
        Assertions.assertEquals(360, result);
    }

    @Test
    void testCalculateCost2() {
        int result = CostCalculator.calculateCost(false, 1);
        Assertions.assertEquals(50, result);
    }
}
