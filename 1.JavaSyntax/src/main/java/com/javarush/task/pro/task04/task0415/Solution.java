package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        scanner.close();
        double square = 3.14 * radius * radius;
        System.out.println((int) square);
    }
}
