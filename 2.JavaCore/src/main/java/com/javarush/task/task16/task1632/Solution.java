package com.javarush.task.task16.task1632;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadOne());
        threads.add(new ThreadTwo());
        threads.add(new ThreadThree());
        threads.add(new ThreadFour());
        threads.add(new ThreadFive());
    }

    public static void main(String[] args) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public static class ThreadOne extends Thread {

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

    public static class ThreadTwo extends Thread {

        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThreadThree extends Thread {

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

    public static class ThreadFour extends Thread implements Message {

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

    public static class ThreadFive extends Thread {

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            try {
                while (!isInterrupted()) {
                    String line = scanner.nextLine();
                    if ("N".equals(line)) break;
                    sum += Integer.parseInt(line);
                }
                System.out.println(sum);
            } catch (Exception ignored) {}
        }
    }
}
