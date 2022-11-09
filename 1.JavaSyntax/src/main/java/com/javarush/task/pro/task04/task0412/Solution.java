package com.javarush.task.pro.task04.task0412;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        scanner.close();
        int sum = 0;
        for (; start < end; start++) {
            if (start % multiple != 0) {
                continue;
            }
            sum += start;
        }
        System.out.println(sum);
    }
}
