package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

public class Solution {

    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();
        scanner.close();
        boolean isA = sideA < sideB + sideC;
        boolean isB = sideB < sideA + sideC;
        boolean isC = sideC < sideB + sideA;
        if (isA && isB && isC) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
