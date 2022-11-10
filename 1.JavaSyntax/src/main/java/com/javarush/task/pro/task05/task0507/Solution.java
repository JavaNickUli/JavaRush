package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

public class Solution {

    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array = new int[scanner.nextInt()];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
