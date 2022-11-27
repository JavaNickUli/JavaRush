package com.javarush.task.task19.task1915;

import java.io.*;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        testString.printSomething();
        String result = out.toString();
        System.setOut(console);
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(pathReader.readLine());
        pathReader.close();
        fileOutputStream.write(result.getBytes());
        fileOutputStream.close();
        System.out.print(result);
    }

    public static class TestString {

        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
