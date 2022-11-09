package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            if (max < temp && temp % 2 == 0) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}
