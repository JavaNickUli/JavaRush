package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String aircraft = reader.readLine();
            if ("helicopter".equals(aircraft)) {
                result = new Helicopter();
            }
            if ("plane".equals(aircraft)) {
                result = new Plane(Integer.parseInt(reader.readLine()));
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
