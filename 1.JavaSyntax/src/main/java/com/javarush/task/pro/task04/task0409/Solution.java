package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            if (min > temp) {
                min = temp;
            }
        }
        System.out.println(min);
    }
}
