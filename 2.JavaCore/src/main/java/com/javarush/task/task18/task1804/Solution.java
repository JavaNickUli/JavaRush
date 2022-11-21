package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        int[] bytes = new int[256];
        while (inputStream.available() > 0) {
            int aByte = inputStream.read();
            bytes[aByte] += 1;
        }
        int minCount = Integer.MAX_VALUE;
        for (int quantity : bytes) {
            if (quantity != 0 && minCount > quantity) {
                minCount = quantity;
            }
        }
        inputStream.close();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == minCount) {
                System.out.print(i + " ");
            }
        }
    }
}
