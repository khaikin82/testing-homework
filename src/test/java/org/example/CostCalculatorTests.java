package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CostCalculatorTests {

//    @Test
//    void testCalculateCost1() {
//        int result = CostCalculator.calculateCost(true, 12);
//        Assertions.assertEquals(360, result);
//    }
//
//    @Test
//    void testCalculateCost2() {
//        int result = CostCalculator.calculateCost(false, 1);
//        Assertions.assertEquals(50, result);
//    }

    @Test
    void testCalculateCostHw04_1() {
        int result = CostCalculator.calculateCost(false, 1);
        Assertions.assertEquals(50, result);
    }

    @Test
    void testCalculateCostHw04_2() {
        int result = CostCalculator.calculateCost(false, 12);
        Assertions.assertEquals(480, result);
    }

    @Test
    void testCalculateCostHw04_3() {
        int result = CostCalculator.calculateCost(true, 1);
        Assertions.assertEquals(30, result);
    }

    @Test
    void testCalculateCostHw04_4() {
        int result = CostCalculator.calculateCost(true, 12);
        Assertions.assertEquals(360, result);
    }

}
