package com.javarush.task.task12.task1220;

public class Solution {

    public static void main(String[] args) {
    }

    public interface CanRun {

        void canRun();
    }

    public interface CanSwim {

        void canSwim();
    }

    public abstract class Human implements CanRun, CanSwim {
    }
}
