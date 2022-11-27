package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader firstReader = new BufferedReader(new FileReader(pathReader.readLine()));
        BufferedReader secondReader = new BufferedReader(new FileReader(pathReader.readLine()));
        pathReader.close();
        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();
        while (firstReader.ready()) {
            firstList.add(firstReader.readLine());
        }
        firstReader.close();
        while (secondReader.ready()) {
            secondList.add(secondReader.readLine());
        }
        secondReader.close();
        int i = 0, j = 0;
        while (i < firstList.size() && j < secondList.size()) {
            if (firstList.get(i).equals(secondList.get(j++))) {
                lines.add(new LineItem(Type.SAME, firstList.get(i++)));
            } else if (firstList.get(i).equals(secondList.get(j--))) {
                lines.add(new LineItem(Type.ADDED, secondList.get(j++)));
            } else {
                lines.add(new LineItem(Type.REMOVED, firstList.get(i++)));
            }
        }
        if (i < firstList.size()) {
            lines.add(new LineItem(Type.REMOVED, firstList.get(i)));
        } else if (j < secondList.size()) {
            lines.add(new LineItem(Type.ADDED, secondList.get(j)));
        }
        for (LineItem item : lines) {
            System.out.println(item.type + " " + item.line);
        }
    }


    public static enum Type {
        ADDED,
        REMOVED,
        SAME
    }

    public static class LineItem {

        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
