package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        int count = 0;
        try (BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(pathReader.readLine()))) {
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                count += (line.length() - line.replaceAll("\\bworld\\b", "").length()) / 5;
            }
        }
        System.out.println(count);
    }
}
