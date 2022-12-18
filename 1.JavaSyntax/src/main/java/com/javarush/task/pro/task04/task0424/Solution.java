package com.javarush.task.pro.task04.task0424;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);
        int num;
        do {
            System.out.println(num = bombInterface.nextInt());
        } while (num % 10 != 0);
    }
}
