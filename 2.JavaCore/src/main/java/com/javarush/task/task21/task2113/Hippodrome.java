package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    public static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Em", 3, 0));
        game.getHorses().add(new Horse("An", 3, 0));
        game.getHorses().add(new Horse("El", 3, 0));
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
