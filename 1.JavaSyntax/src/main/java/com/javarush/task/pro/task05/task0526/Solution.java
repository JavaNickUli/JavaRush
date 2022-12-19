package com.javarush.task.pro.task05.task0526;

import java.util.Arrays;

public class Solution {
    public static int[][] array = {
            {1, 2, 3, 4},
            {4, 5, 6, 7},
            {7, 8, 9, 0}};

    public static void main(String[] args) {
        printArray();
        for (int i = 0; i < array.length / 2; i++) {
            int[] tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        printArray();
    }

    public static void printArray() {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
