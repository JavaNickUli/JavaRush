package com.javarush.task.task15.task1517;

public class Solution {

    public static int A = 0;

    static {
        try {
            A /= A;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
