package com.javarush.task.pro.task09.task0922;

import java.util.Arrays;

public class PiratesWorkbench {

    public static String[] piratesDB = new String[]{
            "Drax",
            "Yondu Udonta",
            "Maz Kanata",
            "キャプテン・ハーロック",
            "Star-Lord",
            "Christopher Summers",
            "Крысс",
            "Весельчак У",
            "Nebula",
            "Rocket",
            "Han Solo",
            "boba Fett"
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(piratesDB));
        corruptDB();
        addTwoNames();
        System.out.println(Arrays.toString(piratesDB));
    }

    public static void corruptDB() {
        int count = 2;
        for (int i = 0; i < piratesDB.length; i++) {
            if (piratesDB[i].contains("b")) {
                piratesDB[i] = piratesDB[i].replaceAll("b", "\b");
                if (--count == 0) break;
            }
        }
    }

    public static void addTwoNames() {
        String[] newPiratesDB = new String[piratesDB.length + 2];
        for (int i = 0; i < piratesDB.length; i++) {
            newPiratesDB[i] = piratesDB[i];
        }
        newPiratesDB[newPiratesDB.length - 2] = "Рыжий Амиго";
        newPiratesDB[newPiratesDB.length - 1] = "Одноглазый Диего";
        piratesDB = newPiratesDB;
    }
}
