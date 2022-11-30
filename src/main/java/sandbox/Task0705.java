package sandbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0705 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] smallArrayOne = new int[10];
        int[] smallArrayTwo = new int[10];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0, j = 0; i < bigArray.length; i++) {
            if (i < (bigArray.length / 2)) {
                smallArrayOne[i] = bigArray[i];
            } else {
                System.out.println(smallArrayTwo[j++] = bigArray[i]);
            }
        }
    }
}
