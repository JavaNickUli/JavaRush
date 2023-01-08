package com.javarush.task.pro.task12.task1206;

public class Solution {

    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";
        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countDigits = 0;
        for (char symbol : string.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        return countDigits;
    }

    public static int countLetters(String string) {
        int countLetters = 0;
        for (char symbol : string.toCharArray()) {
            if (Character.isLetter(symbol)) {
                countLetters++;
            }
        }
        return countLetters;
    }

    public static int countSpaces(String string) {
        int countSpace = 0;
        for (char symbol : string.toCharArray()) {
            if (symbol == ' ') {
                countSpace++;
            }
        }
        return countSpace;
    }
}
