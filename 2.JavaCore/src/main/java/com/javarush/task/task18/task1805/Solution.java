package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) throws Exception {
        Set<Integer> set = new TreeSet<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            while (inputStream.available() > 0) {
                set.add(inputStream.read());
            }
            for (int aByte : set) {
                System.out.print(aByte + " ");
            }
        }
    }
}
