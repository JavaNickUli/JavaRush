package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int middleIndex = array.length - array.length / 2;
        Arrays.fill(array, 0, middleIndex, valueStart);
        Arrays.fill(array, middleIndex, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
