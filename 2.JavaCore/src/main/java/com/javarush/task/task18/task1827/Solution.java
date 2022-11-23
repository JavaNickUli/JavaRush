package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        if (args.length == 0 || !"-c".equals(args[0])) {
            return;
        }
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        String path = pathReader.readLine();
        pathReader.close();
        BufferedReader fileBufferReader = new BufferedReader(new FileReader(path));
        long maxId = 0;
        while (fileBufferReader.ready()) {
            long id = Long.parseLong(fileBufferReader.readLine().substring(0, 8).trim());
            if (maxId < id) {
                maxId = id;
            }
        }
        fileBufferReader.close();
        FileWriter fileWriter = new FileWriter(path, true);
        fileWriter.write(String.format("\n%-8d%-30s%-8s%-4s", ++maxId, args[1], args[2], args[3]));
        fileWriter.close();
    }
}
