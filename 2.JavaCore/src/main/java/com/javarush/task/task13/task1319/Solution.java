package com.javarush.task.task13.task1319;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
        String line;
        do {
            bufferedWriter.write((line = bufferedReader.readLine()) + "\n");
        } while (!line.equals("exit"));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
