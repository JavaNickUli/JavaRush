package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        int[] bytes = new int[256];
        int maxCount = 0;
        while (inputStream.available() > 0) {
            int aByte = inputStream.read();
            if ((bytes[aByte] += 1) > maxCount) {
                maxCount = bytes[aByte];
            }
        }
        inputStream.close();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == maxCount) {
                System.out.print(i + " ");
            }
        }
    }
}
