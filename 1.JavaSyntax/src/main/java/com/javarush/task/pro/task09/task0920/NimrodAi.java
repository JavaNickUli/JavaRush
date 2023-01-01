package com.javarush.task.pro.task09.task0920;

import java.util.Arrays;

public class NimrodAi {

    public static String[] diningRoom = {
            "button for emergency meeting",
            "table", "table", "table", "table", "table",
            "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench",
            "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench"};
    public static String[] o2 = {"plant", "plant"};
    public static String[] medRoom = {"bed", "bed", "bed", "bed", "SCAN-MO-TRON-2000", "liquid analyser"};
    public static String[] armoury = {"cannon launcher", "chair"};
    public static String[] securityRoom = {"rack", "rack", "table"};
    public static String[] reactor = {"reactor"};
    public static String[] telecom = {"computer", "computer", "computer", "table", "chair"};
    public static String[] warehouse = {
            "container", "container", "container",
            "box", "box", "box", "box", "box", "box",
            "barrel", "barrel", "barrel", "barrel"};
    public static String[] controlRoom = {"interactive ship map", "chair", "chair", "chair"};
    public static String[] powerRoom = {"power lamp", "power lamp", "power lamp",
            "power lamp", "power lamp", "power lamp", "power lamp"};

    public static void main(String[] args) {
        String[] roomsNames = {"diningRoom", "o2", "medRoom", "armoury", "securityRoom",
                "reactor", "telecom", "warehouse", "controlRoom", "powerRoom"};
        for (String room : roomsNames) {
            if (checkPirates(room)) {
                openFloodgates(room);
            }
        }
    }

    public static boolean checkPirates(String roomName) {
        String[] room = getRoomByName(roomName);
        if (room == null) {
            return false;
        }
        String[] scanResult = RoomScanner.scanRoom(roomName);
        System.out.printf("В %s обнаружено: %s\n", roomName, Arrays.toString(scanResult));
        if (scanResult.length > room.length) return true;
        for (String scan : scanResult) {
            boolean isAbsent = true;
            for (String el : room) {
                if (el.equals(scan)) {
                    isAbsent = false;
                    break;
                }
            }
            if (isAbsent) return true;
        }
        return false;
    }

    public static void openFloodgates(String roomName) {
        System.out.printf("ВНИМАНИЕ, открытие шлюзов в %s\n\n", roomName);
        Arrays.fill(getRoomByName(roomName), null);
    }

    public static String[] getRoomByName(String roomName) {
        switch (roomName) {
            case "diningRoom":
                return diningRoom;
            case "o2":
                return o2;
            case "medRoom":
                return medRoom;
            case "armoury":
                return armoury;
            case "securityRoom":
                return securityRoom;
            case "reactor":
                return reactor;
            case "telecom":
                return telecom;
            case "warehouse":
                return warehouse;
            case "controlRoom":
                return controlRoom;
            case "powerRoom":
                return powerRoom;
        }
        return null;
    }
}
