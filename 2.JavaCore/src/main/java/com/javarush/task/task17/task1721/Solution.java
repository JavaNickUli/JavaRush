package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader path = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader first = new BufferedReader(new FileReader(path.readLine()));
        BufferedReader second = new BufferedReader(new FileReader(path.readLine()));
        while (first.ready()) {
            allLines.add(first.readLine());
        }
        while (second.ready()) {
            forRemoveLines.add(second.readLine());
        }
        path.close();
        first.close();
        second.close();
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (!allLines.containsAll(forRemoveLines)) {
            allLines.clear();
            throw new CorruptedDataException();
        }
        allLines.removeAll(forRemoveLines);
    }
}
