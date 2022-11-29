package sandbox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2209 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(pathReader.readLine()))) {
            StringBuilder words = new StringBuilder();
            while (fileReader.ready()) {
                words.append(fileReader.readLine()).append(" ");
            }
            System.out.println(getLine(words.toString().split(" ")));
        }
    }

    public static StringBuilder getLine(String... words) {
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
