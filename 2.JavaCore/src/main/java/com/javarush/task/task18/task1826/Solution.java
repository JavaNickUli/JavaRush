package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
        while (fileInputStream.available() > 0) {
            fileOutputStream.write(~fileInputStream.read());
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
