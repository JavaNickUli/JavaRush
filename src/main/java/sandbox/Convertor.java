package sandbox;

import java.util.Arrays;
import java.util.Scanner;

public class Convertor {

    private static Double[] temperature = new Double[10];
    private static boolean isC = true;

    public static void main(String[] args) {
        System.out.println("Какая шкала температуры будет использоваться?\nВедите \"C\" Цельсия или \"F\" Фаренгейта.");
        Scanner scanner = new Scanner(System.in);
        String scale;
        while (!(scale = scanner.nextLine()).equalsIgnoreCase("C") && (isC = !scale.equalsIgnoreCase("F"))) {
            System.out.println("Введён не верный символ. Попробуйте ещё раз.");
        }
        System.out.println("Введите 10 температур для заполнения таблицы.");
        for (int i = 0; i < temperature.length; i++) {
            try {
                temperature[i] = scanner.nextDouble();
                System.out.println("Температура " + temperature[i] + "сохранена в позицию " + i + ".");
            } catch (Exception e) {
                System.out.println("Введены не верные данные в позицию " + i + ". Попробуйте ещё раз.");
            }
        }
        System.out.println("Таблица заполнена данными по шкале " + (isC ? "Цельсия" : "Фаренгейта"));
        System.out.println(Arrays.toString(temperature));
        controller();
    }

    private static void controller() {
        System.out.println("Конвертирую данные в таблицу по шкале " + (!isC ? "Цельсия" : "Фаренгейта"));
    }
}
