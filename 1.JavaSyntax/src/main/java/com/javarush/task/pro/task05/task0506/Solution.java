package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

public class Solution {

    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int num : array) {
            if (min > num) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
