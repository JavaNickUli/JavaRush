package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        int quarter = 2;
        if (y > 0) {
            if (x > 0) {
                quarter--;
            }
        } else {
            quarter++;
            if (x > 0) {
                quarter++;
            }
        }
        System.out.println(quarter);
    }
}
