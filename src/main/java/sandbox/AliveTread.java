package sandbox;

import java.util.Scanner;

/**
 * Задача.
 * Все нужные константы и поля класса прописаны.
 * Нужно преобразовать данный класс к Tread и запустить в дочерней нити с номером канала 1 созданный объект.
 * Наш объект должен через каждые 5 сек выводить в консоль "Chanel № 1 I`m alive!", если он ещё не умирал или
 * "Chanel № X I`m alive again!", где Х - номера следующих каналов.
 * В main нужно реализовать ввод с консоли.
 * Если введено слово "stop", то наш объект должен:
 * вывести в консоль "Chanel № Х is died.(";
 * возродить себя в другой нити со следующим номером канала;
 * закончить работу в этой нити;
 * продолжить свою работу в новой нити.
 * Если введено слово "enough", то наш объект должен прервать своё существование и
 * вывести в консоль "It's definitely dead now".
 *
 * Обязательные зависимости:
 * объект начинает свою работу с chanel == 1;
 * объект выполняет свою работу пока alive == true;
 * объект выполняет действия по возрождению, если command соответствует константе STOP;
 * объект выполняет свою работу в одном канале, пока не переродится по команде "stop";
 * объект окончательно завершает своё существование, если command соответствует константе ENOUGH.
 *
 * Ни одно поле класса менять нельзя и также добавлять!
 */

public class AliveTread extends Thread {

    private final static String ENOUGH = "enough";
    private final static String STOP = "stop";
    private final String I_AM_ALIVE = " I`m alive!";
    private final String I_AM_LIVE_AGAIN = " I`m alive again!";
    private final String IS_DIED = " is died.(";
    private final String NOW = "It's definitely dead now";
    private final String CHANEL = "Chanel № ";
    private static AliveTread aliveTread;
    private static String command;
    private final int chanel;
    private boolean alive;

    public AliveTread(int chanel) {
        this.chanel = chanel;
        alive = true;
        command = null;
    }

    public static void main(String[] args) {
        new AliveTread(1).start();
        Scanner scanner = new Scanner(System.in);
        while (!ENOUGH.equals(command = scanner.nextLine())) {}
        aliveTread.interrupt();
    }

    @Override
    public void run() {
        try {
            while (alive) {
                System.out.println(CHANEL + chanel + (chanel == 1 ? I_AM_ALIVE : I_AM_LIVE_AGAIN));
                Thread.sleep(5000);
                if (STOP.equals(command)) alive = false;
            }
            System.out.println(CHANEL + chanel + IS_DIED);
            (aliveTread = new AliveTread(this.chanel + 1)).start();
        } catch (InterruptedException e) {
            System.out.println(NOW);
        }
    }
}
