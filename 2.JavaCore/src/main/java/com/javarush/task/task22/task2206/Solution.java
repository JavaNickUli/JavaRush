package com.javarush.task.task22.task2206;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format(getFormattedString(), date, date, date, date, date, date));
    }

    public static String getFormattedString() {
        return "%td:%tm:%ty %tT";
    }
}
