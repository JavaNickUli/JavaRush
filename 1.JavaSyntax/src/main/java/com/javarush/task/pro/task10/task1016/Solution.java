package com.javarush.task.pro.task10.task1016;

public class Solution {

    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
        showWeather(new City("Дубай", 40));
    }
}
