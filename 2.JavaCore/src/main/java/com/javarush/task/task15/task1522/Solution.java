package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        switch (new BufferedReader(new InputStreamReader(System.in)).readLine()) {
            case Planet.SUN:
                thePlanet = Sun.getInstance();
                break;
            case Planet.MOON:
                thePlanet = Moon.getInstance();
                break;
            case Planet.EARTH:
                thePlanet = Earth.getInstance();
                break;
            default:
                thePlanet = null;
        }
    }
}
