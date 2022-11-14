package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!"exit".equals(input = reader.readLine())) {
            try {
                double number = Double.parseDouble(input);
                if (input.contains(".")) {
                    print(number);
                } else {
                    if (number > 0 && number < 128) {
                        print((short) number);
                    } else {
                        print((int) number);
                    }
                }
            } catch (NumberFormatException e) {
                print(input);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
