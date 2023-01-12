package com.javarush.task.pro.task12.task1225;

import java.util.ArrayList;

public class Solution {

    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        convertAccounts();
        registerAccount("Амиго");
        registerAccount("Диего");
        for (String account : accountsList) {
            System.out.println(account);
        }
    }

    public static void convertAccounts() {
        for (String account : Accounts.getAccounts()) {
            accountsList.add(account);
        }
    }

    public static void registerAccount(String username) {
        if (!accountsList.contains(username)) {
            accountsList.add(username);
        }
    }
}
