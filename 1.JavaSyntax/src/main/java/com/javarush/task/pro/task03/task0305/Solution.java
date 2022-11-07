package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        console.close();
        if (a == b && a == c) {
            System.out.println(a + " " + a + " " + a);
        } else if (a == b || a == c) {
            System.out.println(a + " " + a);
        } else if (b == c) {
            System.out.println(b + " " + b);
        }
    }
}
