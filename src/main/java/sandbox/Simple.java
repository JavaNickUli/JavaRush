package sandbox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Simple {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            fileName = reader.readLine();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            while (reader.ready()) {
                String[] line = reader.readLine().split("[\\s.]");

                for (int i = 0; i < line.length; i++) {

                    for (Integer key : map.keySet()) {

                        try {
                            if (Integer.parseInt(line[i]) == key) {
                                line[i] = map.get(key);
//                                System.out.println(line[i]);
                            }
                        } catch (NumberFormatException e) {
                        }
                    }
                }
                String newLine = "";
                for (String item : line) {
                    newLine = newLine + item + " ";
                }
                System.out.print(newLine.trim() + ". ");
            }
        }
    }
}
