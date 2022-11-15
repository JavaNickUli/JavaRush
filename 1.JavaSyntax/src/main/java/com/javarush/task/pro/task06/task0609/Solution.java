package com.javarush.task.pro.task06.task0609;

public class Solution {

    public static void main(String[] args) {
    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long number) {
        return cube(cube(number));
    }
}
