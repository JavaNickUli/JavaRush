package sandbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0702 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        for (int i = list.length - 1; i > 1; i--) {
            list[i] = reader.readLine();
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
