package sandbox.jdk13;

import java.util.Scanner;

public class Task0706 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] count = new int[15];
        for (int i = 0; i < count.length; i++) {
            count[i] = in.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < count.length; i++) {
            if (i % 2 == 0) {
                even += count[i];
            } else {
                odd += count[i];
            }
        }
        String particle = even - odd > 0 ? "" : "не";
        System.out.println("В домах с " + particle + "четными номерами проживает больше жителей.");
    }
}
