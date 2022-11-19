package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {

    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    int index = 1;
                    while (index < args.length) {
                        System.out.println(allPeople.size());
                        if (args[index + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[index], parseDate(args[index + 2])));
                        } else {
                            allPeople.add(Person.createFemale(args[index], parseDate(args[index + 2])));
                        }
                        index += 3;
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    int index = 1;
                    while (index < args.length) {
                        Person person = allPeople.get(Integer.parseInt(args[index]));
                        person.setName(args[index + 1]);
                        person.setSex(parseSex(args[index + 2]));
                        person.setBirthDate(parseDate(args[index + 3]));
                        index += 4;
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    int index = 1;
                    while (index < args.length) {
                        Person person = allPeople.get(Integer.parseInt(args[index++]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    int index = 1;
                    while (index < args.length) {
                        Person person = allPeople.get(Integer.parseInt(args[index++]));
                        System.out.println(person.getName() + " " + ((person.getSex().equals(Sex.MALE) ? "м" : "ж") + " " +
                                new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate())));
                    }
                }
        }
    }

    private static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private static Sex parseSex(String sex) {
        return "м".equals(sex) ? Sex.MALE : Sex.FEMALE;
    }
}