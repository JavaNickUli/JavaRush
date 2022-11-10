package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

public class Solution {

    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        multiArray = new int[scanner.nextInt()][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[scanner.nextInt()];
        }
    }
}
