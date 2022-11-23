package com.javarush.task.task18.task1818;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(pathReader.readLine());
        FileReader firstReader = new FileReader(pathReader.readLine());
        FileReader secondReader = new FileReader(pathReader.readLine());
        pathReader.close();
        while (firstReader.ready()) {
            fileWriter.write(firstReader.read());
        }
        firstReader.close();
        while (secondReader.ready()) {
            fileWriter.write(secondReader.read());
        }
        secondReader.close();
        fileWriter.close();
    }
}
