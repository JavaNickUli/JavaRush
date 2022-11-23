package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        try (BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(pathReader.readLine()))) {
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                if (line.startsWith(args[0] + " ")) {
                    for (String el : line.split(" ")) {
                        System.out.print(el + " ");
                    }
                    System.out.println("\b");
                    break;
                }
            }
        }
    }
}
