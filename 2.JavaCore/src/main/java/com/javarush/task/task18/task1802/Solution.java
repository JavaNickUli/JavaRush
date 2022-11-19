package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        reader.close();
        byte min = Byte.MAX_VALUE;
        while (fileReader.available() > 0) {
            byte el = (byte) fileReader.read();
            if (min > el) {
                min = el;
            }
        }
        fileReader.close();
        System.out.println(min);
    }
}
