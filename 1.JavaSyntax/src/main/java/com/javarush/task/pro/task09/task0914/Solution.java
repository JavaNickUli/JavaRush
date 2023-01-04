package com.javarush.task.pro.task09.task0914;

public class Solution {

    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";
        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int firsIndex = path.indexOf("jdk");
        int secondIndex = path.indexOf("/", firsIndex + 3);
        return path.substring(0, firsIndex) + jdk + path.substring(secondIndex);
    }
}
