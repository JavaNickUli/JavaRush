package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new TreadOne());
        threads.add(new TreadTwo());
        threads.add(new TreadThree());
        threads.add(new TreadFour());
        threads.add(new TreadFive());
    }

    public static void main(String[] args) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public static class TreadOne extends Thread {

        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class TreadTwo extends Thread {

        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class TreadThree extends Thread {

        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class TreadFour extends Thread implements Message {

        @Override
        public void run() {
            while (!isInterrupted()) {
            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class TreadFive extends Thread {

        @Override
        public void run() {
            int sum = 0;
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                while (!isInterrupted()) {
                    String line = reader.readLine();
                    if ("N".equals(line)) {
                        break;
                    }
                    sum += Integer.parseInt(line);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(sum);
        }
    }
}
