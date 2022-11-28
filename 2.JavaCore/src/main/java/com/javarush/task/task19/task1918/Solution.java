package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(pathReader.readLine()));
        pathReader.close();
        StringBuilder text = new StringBuilder();
        while (fileReader.ready()) {
            text.append(fileReader.readLine());
        }
        fileReader.close();
        String startTeg = "<" + args[0];
        String endTeg = "</" + args[0] + ">";
        int startIndex = text.indexOf(startTeg);
        int endIndex = text.indexOf(endTeg, startIndex + 1);
        int nextIndex = startIndex;
        while (startIndex != -1) {
            nextIndex = text.indexOf(startTeg, nextIndex + 1);
            if (nextIndex > endIndex || nextIndex == -1) {
                System.out.println(text.substring(startIndex, endIndex + endTeg.length()));
                nextIndex = startIndex = text.indexOf(startTeg, startIndex + 1);
            }
            endIndex = text.indexOf(endTeg, (nextIndex == startIndex ? startIndex : endIndex) + 1);
        }
    }
}
