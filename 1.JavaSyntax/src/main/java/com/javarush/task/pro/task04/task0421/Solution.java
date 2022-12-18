package com.javarush.task.pro.task04.task0421;

public class Solution {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        while (count++ < 100) {
            sum += ++count;
        }
        System.out.println(sum);
    }
}
