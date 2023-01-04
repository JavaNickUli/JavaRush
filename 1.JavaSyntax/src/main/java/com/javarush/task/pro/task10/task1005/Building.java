package com.javarush.task.pro.task10.task1005;

public class Building {

    private String type;

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }

    public void initialize(String type) {
        this.type = type;
    }
}
