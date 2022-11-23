package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        int count = 0;
        while (fileReader.ready()) {
            if (String.valueOf((char) fileReader.read()).matches("[a-zA-Z]")) {
                count++;
            }
        }
        fileReader.close();
        System.out.println(count);
    }
}
