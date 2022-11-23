package com.javarush.task.task18.task1808;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(pathReader.readLine());
        byte[] buffer = new byte[65535];
        int count = 0;
        while (fileInputStream.available() > 0) {
            count = fileInputStream.read(buffer);
        }
        fileInputStream.close();
        FileOutputStream fileOutputStreamPath2 = new FileOutputStream(pathReader.readLine());
        FileOutputStream fileOutputStreamPath3 = new FileOutputStream(pathReader.readLine());
        pathReader.close();
        for (int i = 0; i < count; i++) {
            if (i < count - count / 2) {
                fileOutputStreamPath2.write(buffer[i]);
            } else {
                fileOutputStreamPath3.write(buffer[i]);
            }
        }
        fileOutputStreamPath2.close();
        fileOutputStreamPath3.close();
    }
}
