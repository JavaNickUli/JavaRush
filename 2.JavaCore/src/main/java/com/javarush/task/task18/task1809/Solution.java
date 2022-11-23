package com.javarush.task.task18.task1809;

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
        FileOutputStream fileOutputStream = new FileOutputStream(pathReader.readLine());
        pathReader.close();
        while (count-- > 0) {
            fileOutputStream.write(buffer[count]);
        }
        fileOutputStream.close();
    }
}
