package com.javarush.task.pro.task04.task0405;

public class Solution {

    public static void main(String[] args) {
        int height = 10;
        while (height-- > 0) {
            int width = 20;
            while (width-- > 0) {
                boolean symbol = (height == 0 || height == 9 || width == 0 || width == 19);
                System.out.print(symbol ? "Б" : " ");
            }
            System.out.println();
        }
    }
}
