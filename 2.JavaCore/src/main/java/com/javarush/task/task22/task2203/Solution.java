package com.javarush.task.task22.task2203;

public class Solution {

    public static String getPartOfString(String string) throws TooShortStringException {
        String tab = "\t";
        int index;
        if (string == null || (index = string.indexOf(tab)) == -1 || index == string.lastIndexOf(tab)) {
            throw new TooShortStringException();
        }
        return string.substring(index + tab.length(), string.indexOf(tab, index + 1));
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
