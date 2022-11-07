package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();
        if (age < 20 || age > 60) {
            System.out.println("можно не работать");
        }
    }
}
