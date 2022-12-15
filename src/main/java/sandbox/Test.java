package sandbox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        List<String> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        FileWriter fw = new FileWriter(path, true);
        String text;
        while ((text = br.readLine()) != null) {
            strings.add(text);
        }
        for (String s : strings) {
            System.out.println(s);
        }
        fw.write("321");
        br.close();
        fw.close();
    }
}
