package sandbox;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        print(calculate(new Scanner(System.in).nextInt()));
    }

    public static boolean calculate(int num) {
        return num < 10;
    }

    public static void print(boolean flag) {
        System.out.println(flag ? 1 : 2);
    }
}
