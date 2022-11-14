package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2d, "2");
        labels.put(4d, "4");
        labels.put(8d, "8");
        labels.put(16d, "16");
        labels.put(32d, "32");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
