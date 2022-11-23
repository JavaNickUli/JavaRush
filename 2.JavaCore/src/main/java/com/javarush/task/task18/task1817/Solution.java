package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        int countAll = 0;
        int countSpace = 0;
        while (fileReader.ready()) {
            if (' ' == fileReader.read()) {
                countSpace++;
            }
            countAll++;
        }
        fileReader.close();
        System.out.printf("%.2f%n", (double) countSpace / countAll * 100);
    }
}
