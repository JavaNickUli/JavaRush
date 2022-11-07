package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineA = scanner.nextLine();
        String lineB = scanner.nextLine();
        scanner.close();
        if (lineA.equals(lineB)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}
