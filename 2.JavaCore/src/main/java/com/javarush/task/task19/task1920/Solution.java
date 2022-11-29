package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();
        double max = 0;
        while (fileReader.ready()) {
            String[] line = fileReader.readLine().split(" ");
            map.merge(line[0], Double.valueOf(line[1]), Double::sum);
            if (max < map.get(line[0])) {
                max = map.get(line[0]);
            }
        }
        fileReader.close();
        for (Map.Entry<String, Double> el : map.entrySet()) {
            if (max == el.getValue()) {
                System.out.println(el.getKey());
            }
        }
    }
}
