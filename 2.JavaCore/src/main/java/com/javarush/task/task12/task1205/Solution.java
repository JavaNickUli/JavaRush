package com.javarush.task.task12.task1205;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String result;
        switch (o.getClass().getSimpleName()) {
            case "Cow":
                result = "Корова";
                break;
            case "Dog":
                result = "Собака";
                break;
            case "Whale":
                result = "Кит";
                break;
            default:
                result = "Неизвестное животное";
        }
        return result;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
