package com.javarush.task.pro.task12.task1222;

import java.util.ArrayList;

public class Solution {

    public static void printAnything(ArrayList arrayList) {
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");
        printAnything(arrayList);
    }
}