package com.javarush.task.pro.task04.task0405;

public class Solution {

    public static void main(String[] args) {
        int height = 10, width = 20;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                boolean isEdge = i == 1 || i == height || j == 1 || j == width;
                System.out.print(isEdge ? "Б" : " ");
            }
            System.out.println();
        }
    }
}
