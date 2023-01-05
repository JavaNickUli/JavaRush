package sandbox.jdk13;

import java.util.Scanner;

public class Task0413 {

    public static void main(String[] args) {
        String[] week = {"такого дня недели не существует",
                "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        int day = new Scanner(System.in).nextInt();
        System.out.println(day < 1 || day > 7 ? week[0] : week[day]);

        System.out.println(switch (new Scanner(System.in).nextInt()) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "такого дня недели не существует";
        });
    }
}
