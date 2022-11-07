package com.javarush.task.pro.task03.task0309;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        scanner.close();
        System.out.println(numberA > numberB ? numberA : numberB);
    }
}
