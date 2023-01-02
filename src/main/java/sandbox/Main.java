package sandbox;

import java.time.LocalDate;
import java.util.Scanner;

import static java.time.LocalDate.now;

public class Main {

    private static LocalDate currentDate = now();

    public static void main(String[] args) {
        System.out.println("""
                                
                -------------------------------------------------------------------------
                Вас приветствует программа "Таймер до дня рождения"! \uD83C\uDF82
                Автор: ©DreidKare
                Если Вы обнаружили баг / неточность или хотите предложить улучшение
                функционала, свяжитесь со мной в Telegram. Ник в конце программы.
                -------------------------------------------------------------------------
                                
                                
                Введите ваше имя. Поддерживается любой формат (Андрей/Andrey/lilAndrey/андрей/andrey/АнДрЕй).
                """);
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Приветствую, " + username + ", теперь введи свой год рождения в формате 'YYYY'.");
        int year = scanner.nextInt();
        System.out.println("Теперь уточним. Какой сейчас год? Введи в формате 'YYYY'.");
        int yearNow = scanner.nextInt();
        System.out.println("И еще немножко уточнений: какой сейчас месяц? Введи в формате 'Январь/январь - Декабрь/декабрь'.");
        scanner.nextLine();
        String monthNow = scanner.nextLine();
        if (monthNow.equalsIgnoreCase("Январь") || monthNow.equalsIgnoreCase("Февраль") || monthNow.equalsIgnoreCase("Март") || monthNow.equalsIgnoreCase("Апрель") || monthNow.equalsIgnoreCase("Май") || monthNow.equalsIgnoreCase("Июнь")) {
            System.out.println("Отлично, сейчас 1-е полугодие " + yearNow + " года.");
        } else if (monthNow.equalsIgnoreCase("Июль") || monthNow.equalsIgnoreCase("Август") || monthNow.equalsIgnoreCase("Сентябрь") || monthNow.equalsIgnoreCase("Октябрь") || monthNow.equalsIgnoreCase("Ноябрь") || monthNow.equalsIgnoreCase("Декабрь")) {
            System.out.println("Отлично, сейчас 2-е полугодие." + yearNow + " года.");
        } else {
            System.out.println("Похоже, что такого месяца не существует! Перезапусти программу и введи месяц в формате 'Январь / январь - Декабрь / декабрь'. \nЕсли вы уверены, что ввели все правильно, а программа работает неверно, свяжитесь со мной в Telegram.");
            System.exit(0);
        }
        System.out.println();
        System.out.println("И еще чуть-чуть уточнений. Какое сегодня число? Введи в формате '1 - 31'.");
        int day = scanner.nextInt();
        if (day > 0 && day <= 31) {
            System.out.println("Итак, текущая дата: " + monthNow + ", " + day + " (" + yearNow + " года)");
        } else {
            System.out.println("Такого дня не существует! Перезапусти программу и введи день в формате '1 - 31' \nЕсли вы уверены, что ввели все правильно, а программа работает неверно, свяжитесь со мной в Telegram.");
            System.exit(0);
        }
        int monthnowint = 0;
        if (monthNow.equalsIgnoreCase("Январь"))
            monthnowint = 1;
        if (monthNow.equalsIgnoreCase("Февраль"))
            monthnowint = 2;
        if (monthNow.equalsIgnoreCase("Март"))
            monthnowint = 3;
        if (monthNow.equalsIgnoreCase("Апрель"))
            monthnowint = 4;
        if (monthNow.equalsIgnoreCase("Май"))
            monthnowint = 5;
        if (monthNow.equalsIgnoreCase("Июнь"))
            monthnowint = 6;
        if (monthNow.equalsIgnoreCase("Июль"))
            monthnowint = 7;
        if (monthNow.equalsIgnoreCase("Август"))
            monthnowint = 8;
        if (monthNow.equalsIgnoreCase("Сентябрь"))
            monthnowint = 9;
        if (monthNow.equalsIgnoreCase("Октябрь"))
            monthnowint = 10;
        if (monthNow.equalsIgnoreCase("Ноябрь"))
            monthnowint = 11;
        if (monthNow.equalsIgnoreCase("Декабрь"))
            monthnowint = 12;
        System.out.println();
        System.out.println("Ваш возраст: " + (yearNow - year - 1) + " - " + (yearNow - year) + " лет.");
        System.out.println("Точный возраст мы уточним чуть позже.");
        System.out.println();
        System.out.println("А теперь, " + username + ", давай разбираться подробнее.");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("В каком месяце у тебя день рождения? Введи в формате: 'Январь - Декабрь'.");
        scanner.nextLine();
        String month = scanner.nextLine();
        if (month.equalsIgnoreCase("Январь") || month.equalsIgnoreCase("Февраль") || month.equalsIgnoreCase("Март") || month.equalsIgnoreCase("Апрель") || month.equalsIgnoreCase("Май") || month.equalsIgnoreCase("Июнь")) {
            System.out.println("Отлично, твой день рождения в 1 - м полугодии.");
        } else if (month.equalsIgnoreCase("Июль") || month.equalsIgnoreCase("Август") || month.equalsIgnoreCase("Сентябрь") || month.equalsIgnoreCase("Октябрь") || month.equalsIgnoreCase("Ноябрь") || month.equalsIgnoreCase("Декабрь")) {
            System.out.println("Отлично, твой день рождения во 2 - м полугодии.");
        } else {
            System.out.println("Похоже, что такого месяца не существует! Перезапусти программу и введи месяц в формате 'Декабрь' / 'декабрь' \nЕсли вы уверены, что ввели все правильно, а программа работает не правильно, свяжитесь со мной в Telegram.");
            System.exit(0);
        }
        System.out.println("Месяц твоего дня рождения: " + month + ".");
        System.out.println();
        System.out.println("Теперь введи число твоего дня рождения.");
        int daybirthday = scanner.nextInt();
        System.out.println();
        System.out.println("---------------------------------ИТОГ------------------------------------");
        System.out.println("Итак, " + username + ", твой день рождения: " + month + ", " + daybirthday + " (" + year + " года.)");
        int monthbirthdayint = 0;
        if (month.equalsIgnoreCase("Январь"))
            monthbirthdayint = 1;
        if (month.equalsIgnoreCase("Февраль"))
            monthbirthdayint = 2;
        if (month.equalsIgnoreCase("Март"))
            monthbirthdayint = 3;
        if (month.equalsIgnoreCase("Апрель"))
            monthbirthdayint = 4;
        if (month.equalsIgnoreCase("Май"))
            monthbirthdayint = 5;
        if (month.equalsIgnoreCase("Июнь"))
            monthbirthdayint = 6;
        if (month.equalsIgnoreCase("Июль"))
            monthbirthdayint = 7;
        if (month.equalsIgnoreCase("Август"))
            monthbirthdayint = 8;
        if (month.equalsIgnoreCase("Сентябрь"))
            monthbirthdayint = 9;
        if (month.equalsIgnoreCase("Октябрь"))
            monthbirthdayint = 10;
        if (month.equalsIgnoreCase("Ноябрь"))
            monthbirthdayint = 11;
        if (month.equalsIgnoreCase("Декабрь"))
            monthbirthdayint = 12;

        if (monthbirthdayint == monthnowint && daybirthday == day) {
            System.out.println();
        } else if (monthbirthdayint == monthnowint) {
            System.out.println("Хмммм... Сейчас " + monthNow.toLowerCase() + "... А месяц твоего дня рождения? Тоже " + month.toLowerCase() + ".");
            System.out.println("Получается, твой день рождения уже в этом месяце! Поздравляем!");
            System.out.println();
            System.out.println("Осталось(ся) всего " + (daybirthday - day) + " дней(ня)(нь)! Совсем немного!");
        } else if (monthbirthdayint > monthnowint) {
            System.out.println("До твоего следующего дня рождения осталось: " + (monthbirthdayint - monthnowint) + " месяц(а)(ев).");
        } else if (monthbirthdayint < monthnowint) {
            System.out.println("До твоего следующего дня рождения осталось: " + (12 - (monthnowint - monthbirthdayint)) + " месяц(а)(ев).");
        }
        System.out.println("Теперь давай более точно узнаем сколько тебе лет.");
        if (monthnowint < monthbirthdayint) {
            System.out.println();
            System.out.println("Получается, тебе " + (yearNow - year - 1) + " лет.");
        } else if (monthnowint == monthbirthdayint) {
            if (day < daybirthday) {
                System.out.println("Получается, тебе почти " + (yearNow - year) + " лет.");
            } else if (day == daybirthday) {
                System.out.println("Так-так.. Сейчас " + monthNow + ", " + day + " ... А твой день рождения: " + month + ", " + daybirthday + ".");
                System.out.println("Выходит, ты сегодня именинник!");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Тебе исполняется " + (yearNow - year) + " лет!");
                System.out.println();
                System.out.println(username + ", поздравляем тебя с днем рождения! Всего самого наилучшего!");
                System.out.println("\uD83C\uDF82 \uD83C\uDF82 \uD83C\uDF82 \uD83C\uDF82 \uD83C\uDF82 \uD83C\uDF82");
            }
        } else if (monthnowint > monthbirthdayint) {
            System.out.println();
            System.out.println("Получается, тебе " + (yearNow - year) + " лет.");
        }
        System.out.println("----------------------------ДОПОЛНИТЕЛЬНО--------------------------------");
        System.out.println();
        System.out.println("Telegram: ©DreidKare");

    }

    private static int month(String month) {
        return switch (month.toLowerCase()) {
            case "январь" -> 1;
            case "февраль" -> 2;
            case "март" -> 3;
            case "апрель" -> 4;
            case "май" -> 5;
            case "июнь" -> 6;
            case "июль" -> 7;
            case "август" -> 8;
            case "сентябрь" -> 9;
            case "октябрь" -> 10;
            case "ноябрь" -> 11;
            case "декабрь" -> 12;
            default -> 0;
        };
    }
}
