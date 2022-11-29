package com.javarush.task.task19.task1925;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]))) {
            int count = 0;
            while (fileReader.ready()) {
                String[] line = fileReader.readLine().split(" ");
                for (String el : line) {
                    if (el.length() > 6) {
                        fileWriter.write((count++ == 0 ? "" : ",") + el);
                    }
                }
            }
        }
    }
}
