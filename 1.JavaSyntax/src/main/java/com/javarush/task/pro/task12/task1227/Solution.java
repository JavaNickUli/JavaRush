package com.javarush.task.pro.task12.task1227;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<Robot> cableContents = new ArrayList<>(Arrays.asList(new Robot("T1000"), new Robot("Amigo"),
            new Robot("B1"), new Robot("Diego"), new Robot("Zed")));
    private static List<Robot> rescuedRobots = new ArrayList<>();

    public static void main(String[] args) {
        rescueRobots();
        emptyGarbageBin();
        printList(rescuedRobots);
    }

    private static void rescueRobots() {
        for (Robot robot : cableContents) {
            if ("Amigo".equals(robot.getName()) || "Diego".equals(robot.getName())) {
                rescuedRobots.add(robot);
            }
        }
        for (Robot robot : rescuedRobots) {
            cableContents.remove(robot);
        }
    }

    private static void emptyGarbageBin() {
        cableContents.removeAll(rescuedRobots);
        System.out.println("Garbage cleared");
    }

    public static void printList(List<Robot> list) {
        for (Robot o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}