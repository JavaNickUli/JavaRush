package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        StringBuilder words = new StringBuilder();
        try (BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(pathReader.readLine()))) {
            while (fileReader.ready()) {
                words.append(fileReader.readLine()).append(" ");
            }
        }
        StringBuilder result = getLine(words.toString().split(" "));
        System.out.println(result);
    }

    public static StringBuilder getLine(String... words) {
        if (words == null) return new StringBuilder();
        StringBuilder orderWords = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            char endChar = orderWords.charAt(orderWords.length() - 1);
            for (String addWord : words) {
                if (endChar == addWord.toLowerCase().charAt(0)) {
                    orderWords.append(" ").append(addWord);
                }
            }
        }
        return orderWords;
    }
}
