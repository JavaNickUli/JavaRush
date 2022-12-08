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

    public void run() {
        int i = 0;
        try {
            while (i++ < 100) {
                move();
                print();
                Thread.sleep(200);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
