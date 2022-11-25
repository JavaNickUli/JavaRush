package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        String path;
        while (!(path = pathReader.readLine()).equals("exit")) {
            new ReadThread(path).start();
        }

    }

    public static class ReadThread extends Thread {

        private final String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                int[] bytes = new int[256];
                int max = 0;
                while (fileInputStream.available() > 0) {
                    int aByte = fileInputStream.read();
                    bytes[aByte] += 1;
                    if (max < bytes[aByte]) {
                        max = bytes[aByte];
                    }
                }
                for (int i = 0; i < bytes.length; i++) {
                    if (max == bytes[i]) {
                        resultMap.put(fileName, i);
                        break;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
