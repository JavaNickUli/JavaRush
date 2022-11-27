package com.javarush.task.task19.task1908;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(pathReader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(pathReader.readLine()));
        pathReader.close();
        while (fileReader.ready()) {
            for (String number : fileReader.readLine().split(" ")) {
                if (number.matches("^\\d+$")) {
                    fileWriter.write(number + " ");
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
