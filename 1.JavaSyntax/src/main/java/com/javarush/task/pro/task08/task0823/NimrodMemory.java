package com.javarush.task.pro.task08.task0823;

public class NimrodMemory {

    public static long[] santaFabrica = new long[99000];
    public static long[] eroticSimulators = new long[100500];

    public static void main(String[] args) {
        markForDeletion();
        System.out.println(Long.toBinaryString(santaFabrica[0]));
    }

    public static void markForDeletion() {
        int flag = 0b100000001000000010000000000000;
        for (int i = 0; i < santaFabrica.length; i++) {
            santaFabrica[i] |= flag;
        }
        for (int i = 0; i < eroticSimulators.length; i++) {
            eroticSimulators[i] |= flag;
        }
    }
}
