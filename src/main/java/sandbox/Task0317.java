package sandbox;

import java.util.Scanner;

public class Task0317 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        for (int i = 0; i < 4; i++) {
            if ((number = scanner.nextInt()) > 0) {
                System.out.println(number);
            }
        }
    }
}
