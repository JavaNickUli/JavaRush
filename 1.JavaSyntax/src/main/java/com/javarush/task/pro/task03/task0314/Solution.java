package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

public class Solution {

    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        scanner.close();
        if (secret.equalsIgnoreCase(password)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
    }
}
