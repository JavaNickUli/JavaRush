package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(pathReader.readLine());
        pathReader.close();
        byte[] buffer = new byte[65535];
        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
        }
        fileInputStream.close();
        int count = 0;
        for (byte aByte : buffer) {
            if (',' == aByte) {
                count++;
            }
        }
        System.out.println(count);
    }
}
