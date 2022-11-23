package com.javarush.task.task18.task1819;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        String firstPath;
        try (BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream firstInputStream = new FileInputStream(firstPath = pathReader.readLine());
             FileInputStream secondInputStream = new FileInputStream(pathReader.readLine());
             ByteArrayOutputStream out = new ByteArrayOutputStream();
             FileOutputStream fileOutputStream = new FileOutputStream(firstPath)) {
            while (secondInputStream.available() > 0) {
                out.write(secondInputStream.read());
            }
            while (firstInputStream.available() > 0) {
                out.write(firstInputStream.read());
            }
            out.writeTo(fileOutputStream);
        }
    }
}
