package sandbox;

import java.util.Scanner;

public class Task0508 {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        boolean h = false;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 6; i++)
            strings[i] = s.nextLine();
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++)
                if (strings[i].equals(strings[j])) {
                    strings[j] = null;
                    h = true;
                }
            if (h) {
                strings[i] = null;
                h = false;
            }

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
