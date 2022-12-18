package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = min;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (min > num) {
                secondMin = min;
                min = num;
            }
            if (secondMin > num && min != num) {
                secondMin = num;
            }
        }
        System.out.println(secondMin);
    }
}
