package com.javarush.task.task13.task1315;

public class Solution {

    public static void main(String[] args) {
    }

    public interface Movable {

        void move();
    }

    public interface Edible {

        void beEaten();
    }

    public interface Eat {

        void eat();
    }

    public class Cat implements Movable, Eat, Edible {

        @Override
        public void move() {
        }

        @Override
        public void eat() {
        }

        @Override
        public void beEaten() {
        }
    }

    public class Mouse implements Movable, Edible {

        @Override
        public void move() {
        }

        @Override
        public void beEaten() {
        }
    }

    public class Dog implements Movable, Eat {

        @Override
        public void move() {
        }

        @Override
        public void eat() {
        }
    }
}
