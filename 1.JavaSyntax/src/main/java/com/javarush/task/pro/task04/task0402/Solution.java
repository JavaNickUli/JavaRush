package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        int count = 10;
        while (count-- > 0) {
            System.out.println(name + text);
        }
    }
}
