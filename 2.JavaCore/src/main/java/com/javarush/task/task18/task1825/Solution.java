package com.javarush.task.task18.task1825;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        String path = null;
        String part;
        int maxNumberOfPart = 0;
        while (!"end".equals(part = pathReader.readLine())) {
            String[] temp = part.split(".part");
            if (path == null) {
                path = temp[0];
            }
            int numberOfPart = Integer.parseInt(temp[1]);
            if (maxNumberOfPart < numberOfPart) {
                maxNumberOfPart = numberOfPart;
            }
        }
        pathReader.close();
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path))) {
            for (int i = 1; i <= maxNumberOfPart; i++) {
                String pathInput = path + ".part" + i;
                try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(pathInput))) {
                    while (input.available() > 0) {
                        out.write(input.read());
                    }
                }
            }
        }
    }
}
