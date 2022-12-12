package sandbox;

import java.util.Formatter;

public class Simple {

    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("This is a %s %d book", "java", 8);
        System.out.println(f);
        System.out.println();
        double x = 1000.0 / 3.0;
        System.out.println("Строка без форматирования: " + x);
        Formatter formatter = new Formatter();
        formatter.format("Строка c форматированием: %.2f%n", x);
        formatter.format("Строка c форматированием: %8.2f%n", x);
        formatter.format("Строка c форматированием: %16.2f%n", x);
        System.out.println(formatter);
    }
}
