package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSunday;
        int number;
        System.out.print("Ngày mua có phải chủ nhật không?: ");
        isSunday = scanner.nextBoolean();
        System.out.print("Nhập số suất mua: ");
        number = scanner.nextInt();

        int cost = CostCalculator.calculateCost(isSunday, number);
        System.out.println(cost);
    }
}