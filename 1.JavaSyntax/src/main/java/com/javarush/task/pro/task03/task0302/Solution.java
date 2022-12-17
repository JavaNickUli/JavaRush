package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        console.close();
        if (age >= 18 && age <= 28) {
            System.out.println(name + militaryCommissar);
        }
    }
}
