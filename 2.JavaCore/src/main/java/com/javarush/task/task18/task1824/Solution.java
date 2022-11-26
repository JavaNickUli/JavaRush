package com.javarush.task.task18.task1824;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        String path = null;
        while (true) {
            try (FileReader fileReader = new FileReader(path = pathReader.readLine());) {
            } catch (FileNotFoundException e) {
                System.out.println(path);
                break;
            }
        }
    }
}
