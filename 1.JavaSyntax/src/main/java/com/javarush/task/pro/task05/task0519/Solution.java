package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] newArray = Arrays.copyOf(array, array.length);
        Arrays.sort(newArray);
        System.out.println(Arrays.binarySearch(newArray, element) >= 0);
    }
}
