package com.javarush.task.pro.task08.task0819;

import java.util.Random;

import static com.javarush.task.pro.task08.task0819.CosmicAnomaly.*;

public class Solution {

    public static void main(String[] args) {
        Random random = new Random();
        int num;
        while ((num = random.nextInt(upperBound - lowerBound) + lowerBound) != nextAttempt(num)) {
        }
    }
}
