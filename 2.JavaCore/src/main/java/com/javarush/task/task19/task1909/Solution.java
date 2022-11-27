package com.javarush.task.task19.task1909;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(pathReader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(pathReader.readLine()));
        pathReader.close();
        while (fileReader.ready()) {
            fileWriter.write(fileReader.readLine().replaceAll("\\.", "!"));
        }
        fileReader.close();
        fileWriter.close();
    }
}
