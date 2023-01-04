package com.javarush.task.pro.task09.task0918;

public class Solution {

    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";
        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (String str : strings) {
            stringBuilder.append(str);
        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        return new StringBuilder(string).replace(start, end, str);
    }
}
