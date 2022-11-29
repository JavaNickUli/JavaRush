package com.javarush.task.task19.task1923;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));
        while (fileReader.ready()) {
            String[] line = fileReader.readLine().split(" ");
            for (String el : line) {
                if (el.matches(".*[0-9]+.*")) {
                    fileWriter.write(el + " ");
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
