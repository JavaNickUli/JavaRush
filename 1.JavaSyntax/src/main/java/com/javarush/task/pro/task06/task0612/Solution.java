package com.javarush.task.pro.task06.task0612;

public class Solution {

    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String text = "Корень квадратный для числа ";
        for (int element : array) {
            double elementSqrt = Math.sqrt(element);
            System.out.println(text + element + " равен " + elementSqrt);
        }
    }
}
