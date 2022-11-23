package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        int[] symbols = new int[256];
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int aByte = fileReader.read();
                symbols[aByte] += 1;
            }
        }
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] != 0) {
                System.out.println((char) i + " " + symbols[i]);
            }
        }
    }
}
