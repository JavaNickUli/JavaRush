package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            exceptions.remove(0);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Integer.parseInt("one");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            char symbol = "Hello".charAt(5);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int num = (new int[]{1, 2, 3})[3];
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] nums = new int[-1];
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int s = "null".compareTo(null);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Class.forName(":");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object primitives = new int[1];
            Integer[] integers = (Integer[]) primitives;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object[] strings = new String[5];
            strings[0] = 'o';
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
