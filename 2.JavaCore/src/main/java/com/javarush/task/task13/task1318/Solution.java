package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
        fileInputStream.close();
        bufferedReader.close();
    }
}
