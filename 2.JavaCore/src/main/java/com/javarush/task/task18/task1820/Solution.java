package com.javarush.task.task18.task1820;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        try (BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(pathReader.readLine()));
             FileWriter fileWriter = new FileWriter(pathReader.readLine(), true)) {
            while (fileReader.ready()) {
                String[] words = fileReader.readLine().split(" ");
                for (String word : words) {
                    fileWriter.write(String.valueOf(Math.round(Double.parseDouble(word))) + " ");
                }
            }
        }
    }
}
