package com.javarush.task.task16.task1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        reader.readLine();
        stopwatch.interrupt();
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {

        private int seconds;

        public void run() {
            try {
                while (!this.isInterrupted()) {
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
