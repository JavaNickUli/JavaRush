package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        if (args.length == 0 || !"-u".equals(args[0]) && !"-d".equals(args[0])) {
            return;
        }
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        String path = pathReader.readLine();
        pathReader.close();
        BufferedReader fileBufferReader = new BufferedReader(new FileReader(path));
        List<String> list = new ArrayList<>();
        while (fileBufferReader.ready()) {
            String line = fileBufferReader.readLine();
            if (args[1].equals(line.substring(0, 8).trim())) {
                if ("-u".equals(args[0])) {
                    list.add(String.format("%-8s%-30s%-8s%-4s\n", args[1], args[2], args[3], args[4]));
                }
            } else {
                list.add(line + "\n");
            }
        }
        fileBufferReader.close();
        new FileWriter(path).close();
        FileWriter fileWriter = new FileWriter(path, true);
        for (String line : list) {
            fileWriter.write(line);
        }
        fileWriter.close();
    }
}
