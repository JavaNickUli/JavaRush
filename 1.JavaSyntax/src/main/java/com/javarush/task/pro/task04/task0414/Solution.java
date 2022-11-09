package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number = scanner.nextInt();
        scanner.close();
        do {
            System.out.println(line);
        } while (number > 1 && number-- < 5);
    }
}
