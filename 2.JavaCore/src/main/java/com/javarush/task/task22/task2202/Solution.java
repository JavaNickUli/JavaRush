package com.javarush.task.task22.task2202;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        try {
            String[] words = string.split(" ");
            return String.join(" ", words[1], words[2], words[3], words[4]);
        } catch (Exception e) {
            throw new TooShortStringException(e);
        }
    }

    public static class TooShortStringException extends RuntimeException {

        public TooShortStringException(Throwable cause) {
            super(cause);
        }
    }
}
