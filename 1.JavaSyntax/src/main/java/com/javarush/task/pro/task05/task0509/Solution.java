package com.javarush.task.pro.task05.task0509;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i <= MULTIPLICATION_TABLE.length; i++) {
            for (int j = 1; j <= MULTIPLICATION_TABLE[i - 1].length; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
            }
        }
        for (int[] row : MULTIPLICATION_TABLE) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
