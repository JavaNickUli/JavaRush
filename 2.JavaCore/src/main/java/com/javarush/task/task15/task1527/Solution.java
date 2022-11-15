package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        reader.close();
        String param = url.substring(url.indexOf("?") + 1);
        for (String el : param.split("&")) {
            System.out.print((el.contains("=") ? el.substring(0, el.indexOf("=")) : el) + " ");
        }
        System.out.println();
        int indexObj = param.indexOf("obj=") + 4;
        if (indexObj > 3) {
            String value = param.substring(indexObj, param.indexOf("&", indexObj));
            try {
                double num = Double.parseDouble(value);
                alert(num);
            } catch (NumberFormatException e) {
                alert(value);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
