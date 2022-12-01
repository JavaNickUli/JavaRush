package com.javarush.task.task20.task2025;

import java.util.Arrays;

public class Solution {

    public static long[] getNumbers(long N) {
        if (N < 1) {
            return new long[0];
        }
        int numberLength = String.valueOf(N).length();
        long[][] powTable = new long[10][numberLength + 1];
        for (int i = 0; i < powTable.length; i++) {
            for (int j = 0; j < powTable[0].length; j++) {
                powTable[i][j] = i;
                for (int k = 1; k < j; k++) {
                    powTable[i][j] *= i;
                }
            }
        }
        int[] numsArray = new int[numberLength];
        numsArray[0] = String.valueOf(N).charAt(0) - '0';
        Arrays.fill(numsArray, 1, numsArray.length, 9);
        long[] numberOfArmstrong = new long[0];
        while (numsArray[numsArray.length - 1] != 0) {
            int leadZero = 0;
            for (int el : numsArray) {
                if (el == 0) leadZero++;
                else break;
            }
            for (int i = numberLength - leadZero; i <= numberLength; i++) {
                long sum = 0;
                for (int el : numsArray) {
                    sum += powTable[el][i];
                }
                String sumLine = String.valueOf(sum);
                if (sumLine.length() > numsArray.length) {
                    continue;
                }
                int[] sumOfSign = new int[numsArray.length];
                int delta = numsArray.length - sumLine.length();
                if (sumLine.length() != i) {
                    continue;
                }
                for (int j = 0; j < sumLine.length(); j++) {
                    sumOfSign[j + delta] = sumLine.charAt(j) - '0';
                }
                Arrays.sort(sumOfSign);
                if (Arrays.equals(sumOfSign, numsArray) && sum < N) {
                    numberOfArmstrong = Arrays.copyOf(numberOfArmstrong, numberOfArmstrong.length + 1);
                    numberOfArmstrong[numberOfArmstrong.length - 1] = sum;
                }
            }
            Arrays.fill(numsArray, 0, leadZero + 1, numsArray[leadZero] - 1);
        }
        Arrays.sort(numberOfArmstrong);
        return numberOfArmstrong;
    }


    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}