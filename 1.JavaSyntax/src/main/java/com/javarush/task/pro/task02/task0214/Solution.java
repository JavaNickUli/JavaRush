package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line1 = console.nextLine();
        String line2 = console.nextLine();
        String line3 = console.nextLine();
        System.out.println(line3);
        System.out.println(line2.toUpperCase());
        System.out.println(line1.toLowerCase());
    }
}
