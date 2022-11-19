package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {

    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static void main(String[] args) {
        switch (args[0]) {
            case "-c":
                execute(null, args[1], parseSex(args[2]), parseDate(args[3]));
                break;
            case "-r":
                display(args[1]);
                break;
            case "-u":
                execute(args[1], args[2], parseSex(args[3]), parseDate(args[4]));
                break;
            case "-d":
                execute(args[1], null, null, null);
        }
    }

    public static void display(String id) {
        Person person = allPeople.get(Integer.parseInt(id));
        System.out.println(person.getName() + " " + ((person.getSex().equals(Sex.MALE) ? "м" : "ж") + " " +
                new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate())));
    }

    public static void execute(String id, String name, Sex sex, Date date) {
        if (id == null) {
            System.out.println(id = String.valueOf(allPeople.size()));
            allPeople.add(Person.createMale(name, date));
        }
        Person person = allPeople.get(Integer.parseInt(id));
        person.setName(name);
        person.setSex(sex);
        person.setBirthDate(date);
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
