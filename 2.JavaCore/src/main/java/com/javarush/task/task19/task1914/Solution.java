package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        testString.printSomething();
        String expression = out.toString();
        System.setOut(console);
        String[] parts = expression.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        System.out.printf("%s %s %s = %d\n", parts[0], parts[1], parts[2],
                parts[1].equals("+") ? a + b : parts[1].equals("-") ? a - b : a * b);
    }

    public static class TestString {

        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
