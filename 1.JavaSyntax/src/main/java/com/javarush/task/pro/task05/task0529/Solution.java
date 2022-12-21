package com.javarush.task.pro.task05.task0529;

import java.util.Arrays;

public class Solution {

    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);
            field[i][(int) (Math.random() * width)] = robotank;
        }
        for (int i = 0; i < field.length; i++) {
            boolean isAlive = true;
            while (isAlive) {
                Arrays.fill(bombs[i], 0);
                for (int j = 0; j < 10; j++) {
                    int bomb = (int) (Math.random() * width);
                    if (bombs[i][bomb] == 0) {
                        bombs[i][bomb] = 1;
                    } else j--;
                    if (field[i][bomb].equals(robotank)) {
                        field[i][bomb] = hit;
                        isAlive = false;
                    }
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
