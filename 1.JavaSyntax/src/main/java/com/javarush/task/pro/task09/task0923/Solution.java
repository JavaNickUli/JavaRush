package com.javarush.task.pro.task09.task0923;

import static com.javarush.task.pro.task09.task0923.CaptainBridge.checkAccess;
import static com.javarush.task.pro.task09.task0923.CaptainBridge.debugAccess;

public class Solution {

    public static void main(String[] args) {
        String role = "";
        String[] accounts = {"Раб", "Гость", "Боец", "Ветеран", "Картографист", "Капитан", "Стив"};
        for (String account : accounts) {
            if (debugAccess(account)) {
                role = account;
                break;
            }
        }
        checkAccess(role);
    }
}
