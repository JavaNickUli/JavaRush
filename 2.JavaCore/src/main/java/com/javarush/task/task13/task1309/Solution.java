package com.javarush.task.task13.task1309;

public class Solution {

    public static void main(String[] args) throws Exception {
    }

    public interface CanMove {

        Double speed();
    }

    public interface CanFly extends CanMove {

        Double speed(CanFly fly);
    }
}
