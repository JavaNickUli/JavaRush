package sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jdk13task0709 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            list.add(line);
            if (min > line.length()) {
                min = line.length();
            }
        }
        for (String line : list) {
            if (min == line.length()) {
                System.out.println(line);
            }
        }
    }
}
