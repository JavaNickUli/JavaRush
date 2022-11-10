package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        if (length > 0) {
            int[] array = new int[length];
            for (int i = 0; i < array.length; i++) {
                array[length % 2 == 0 ? array.length - i - 1 : i] = scanner.nextInt();
            }
            scanner.close();
            for (int num : array) {
                System.out.println(num);
            }
        }
    }
}
