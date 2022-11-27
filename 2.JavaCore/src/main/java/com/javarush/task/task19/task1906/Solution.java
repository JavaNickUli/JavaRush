package com.javarush.task.task19.task1906;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(pathReader.readLine());
        FileWriter fileWriter = new FileWriter(pathReader.readLine());
        pathReader.close();
        while (fileReader.ready()) {
            fileReader.read();
            fileWriter.write(fileReader.read());
        }
        fileReader.close();
        fileWriter.close();
    }
}
