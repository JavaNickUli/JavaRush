package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        List<Integer> list = new ArrayList<>();
        while (bufferedReader.ready()) {
            int num = Integer.parseInt(bufferedReader.readLine());
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        fileInputStream.close();
        bufferedReader.close();
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
