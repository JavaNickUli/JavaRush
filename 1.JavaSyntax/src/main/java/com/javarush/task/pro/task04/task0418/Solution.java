package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean optimistic = scanner.nextBoolean();
        scanner.close();
        double number = optimistic ? Math.ceil(glass) : Math.floor(glass);
        System.out.println((int) number);
    }
}
