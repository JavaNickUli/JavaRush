package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Solution {

    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        while (fileReader.ready()) {
            String[] line = fileReader.readLine().split(" ");
            Calendar date = new GregorianCalendar(Integer.parseInt(line[line.length - 1]),
                    Integer.parseInt(line[line.length - 2]) - 1, Integer.parseInt(line[line.length - 3]));
            StringBuilder name = new StringBuilder(line[0]);
            for (int i = 1; i < line.length - 3; i++) {
                name.append(" ").append(line[i]);
            }
            PEOPLE.add(new Person(name.toString(), date.getTime()));
        }
        fileReader.close();
    }
}
