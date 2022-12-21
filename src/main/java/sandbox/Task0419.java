package sandbox;

import java.util.Scanner;

public class Task0419 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            int num = scanner.nextInt();
            if (max < num) max = num;
        }
        System.out.println(max);
    }
}
