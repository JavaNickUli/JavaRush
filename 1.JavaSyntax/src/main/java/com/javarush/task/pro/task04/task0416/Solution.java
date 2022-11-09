package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cola = scanner.nextInt();
        int people = scanner.nextInt();
        scanner.close();
        System.out.println((double) cola / people);
    }
}
