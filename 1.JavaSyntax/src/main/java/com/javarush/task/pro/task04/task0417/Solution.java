package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        scanner.close();
        System.out.println(Math.round(3.6 * speed));
    }
}
