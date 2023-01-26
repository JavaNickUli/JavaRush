package com.javarush.task.pro.task04.task0405;

public class Solution {

    public static void main(String[] args) {
        int height = 10, width = 20;
        int i = 0;
        while (i++ < height) {
            int j = 0;
            while (j++ < width) {
                boolean isEdge = i == 1 || i == height || j == 1 || j == width;
                System.out.print(isEdge ? "Б" : " ");
            }
            System.out.println();
        }
    }
}
