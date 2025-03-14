package org.example;

public class CostCalculator {
    public static int calculateCost(boolean isSunday, int number) {
        int cost = 0, price = 50;
        if (isSunday) {
            price -= 20;
        }
        if (number > 10) {
            price -= 10;
        }
        cost = price * number;
        return cost;
    }
}
