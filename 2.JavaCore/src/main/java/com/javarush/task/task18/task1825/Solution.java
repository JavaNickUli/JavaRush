package com.javarush.task.task18.task1825;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        String filename = null;
        int maxNumberOfPart = 0;
        try (BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in))) {
            String path;
            while (!"end".equals(path = pathReader.readLine())) {
                String[] partsOfPath = path.split(".part");
                if (filename == null) {
                    filename = partsOfPath[0];
                }
                int numberOfPart = Integer.parseInt(partsOfPath[1]);
                if (maxNumberOfPart < numberOfPart) {
                    maxNumberOfPart = numberOfPart;
                }
            }
        }
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename))) {
            for (int i = 1; i <= maxNumberOfPart; i++) {
                String pathInput = filename + ".part" + i;
                try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(pathInput))) {
                    while (input.available() > 0) {
                        out.write(input.read());
                    }
                }
            }
        }
    }
}
