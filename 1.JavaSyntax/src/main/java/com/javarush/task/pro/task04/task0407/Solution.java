package com.javarush.task.pro.task04.task0407;

public class Solution {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        while (count++ < 100) {
            if (count % 3 == 0) {
                continue;
            }
            sum += count;
        }
        System.out.println(sum);
    }
}
