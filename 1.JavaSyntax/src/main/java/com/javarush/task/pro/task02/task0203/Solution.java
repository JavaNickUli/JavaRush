package com.javarush.task.pro.task02.task0203;

public class Solution {

    public static void main(String[] args) {
        int number = 546;
        int lastDigit = number % (number / 10);
        System.out.println(lastDigit);
    }
}
