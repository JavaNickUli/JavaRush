package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf;

    private IMF() {
    }

    public static IMF getFund() {
        synchronized (IMF.class) {
            return imf == null ? imf = new IMF() : imf;
        }
    }
}
