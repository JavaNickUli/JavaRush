package com.javarush.task.pro.task04.task0413;

public class Solution {

    public static void main(String[] args) {
        for (int i = 1, j = 1; i <= 10; j++) {
            System.out.print(8);
            if (j == i) {
                j = 0;
                i++;
                System.out.println();
            }
        }
    }
}
