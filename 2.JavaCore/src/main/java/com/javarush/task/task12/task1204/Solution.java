package com.javarush.task.task12.task1204;

public class Solution {

    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        String result;
        switch (o.getClass().getSimpleName()) {
            case "Cat":
                result = "Кошка";
                break;
            case "Bird":
                result = "Птица";
                break;
            case "Lamp":
                result = "Лампа";
                break;
            case "Dog":
                result = "Собака";
                break;
            default:
                result = "";
        }
        System.out.println(result);
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
