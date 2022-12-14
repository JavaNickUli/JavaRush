package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(System.in);
             BufferedReader bufferedReader = new BufferedReader(new FileReader(scanner.nextLine()))) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine()).append(" ");
            }
        }
        String[] words = stringBuilder.toString().split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] == null || words[j] == null) continue;
                String reverse = new StringBuilder(words[i]).reverse().toString();
                if (words[j].equals(reverse)) {
                    Pair pair = new Pair();
                    pair.first = words[i];
                    pair.second = reverse;
                    words[j] = null;
                    result.add(pair);
                    break;
                }
            }
        }
        for (Pair pair : result) {
            System.out.println(pair.first + " " + pair.second);
        }
    }

    public static class Pair {

        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
