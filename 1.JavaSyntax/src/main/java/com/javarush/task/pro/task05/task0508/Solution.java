package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

public class Solution {

    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        scanner.close();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                boolean duplicate = false;
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null && strings[i].equals(strings[j])) {
                        strings[j] = null;
                        duplicate = true;
                    }
                }
                if (duplicate) {
                    strings[i] = null;
                }
            }
        }
        for (String string : strings) {
            System.out.print(string + ", ");
        }
    }
}
