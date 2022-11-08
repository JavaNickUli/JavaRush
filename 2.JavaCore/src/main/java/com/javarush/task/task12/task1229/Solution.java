package com.javarush.task.task12.task1229;

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {

        public void workHard();
    }

    public static class Director {

        public void workHard() {
        }
    }

    public static class CTO extends Director implements Businessman {
    }
}
