package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        if ("ENTER".equals(scanner.next())) {
            System.out.println(sum);
        }
        scanner.close();
    }
}
