package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        reader.close();
        int maxDenominator = 1;
        for (int i = Math.min(first, second); i > 1; i--) {
            if (first % i == 0 && second % i == 0) {
                maxDenominator = i;
                break;
            }
        }
        System.out.println(maxDenominator);
    }
}
