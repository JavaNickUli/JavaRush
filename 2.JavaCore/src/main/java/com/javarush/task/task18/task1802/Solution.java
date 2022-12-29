package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        int min = Integer.MAX_VALUE;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileReader = new FileInputStream(reader.readLine())) {
            while (fileReader.available() > 0) {
                int el = fileReader.read();
                if (min > el) {
                    min = el;
                }
            }
        }
        System.out.println(min);
    }
}
