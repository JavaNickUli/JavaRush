package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        testString.printSomething();
        String result = out.toString().toUpperCase();
        System.setOut(console);
        System.out.println(result);
    }

    public static class TestString {

        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
