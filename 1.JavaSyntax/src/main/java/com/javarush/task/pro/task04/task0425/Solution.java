package com.javarush.task.pro.task04.task0425;

public class Solution {

    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i == 9 ? death : j == 3 ? hole : land);
            }
            System.out.println();
        }
    }
}
