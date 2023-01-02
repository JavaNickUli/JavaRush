package com.javarush.task.pro.task09.task0921;

import java.util.Arrays;

public class NimrodAi {

    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};
        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        for (PastryLoader pastryLoader : pastryLoaders) {
            for (String[][] array : pastryLoader.memory) {
                for (String[] row : array) {
                    for (int i = 0; i < row.length; i++) {
                        if (row[i].toLowerCase().contains("nimrod")) {
                            row[i] = row[i].toLowerCase().replaceAll("nimrod", "pirate ship");
                        }
                    }
                }
            }
        }
    }
}
