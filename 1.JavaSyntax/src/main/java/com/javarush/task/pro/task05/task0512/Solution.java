package com.javarush.task.pro.task05.task0512;

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int[][] ints : multiArray) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
