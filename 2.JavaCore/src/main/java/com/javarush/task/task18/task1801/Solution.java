package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        reader.close();
        byte max = Byte.MIN_VALUE;
        while (fileReader.available() > 0) {
            byte el = (byte) fileReader.read();
            if (max < el) {
                max = el;
            }
        }
        fileReader.close();
        System.out.println(max);
    }
}
