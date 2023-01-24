package com.javarush.task.pro.task12.task1220;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());
        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (Object el : elements) {
            if (el instanceof String) {
                printString();
            } else if (el instanceof Integer) {
                printInteger();
            } else if (el instanceof Integer[]) {
                printIntegerArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }
}