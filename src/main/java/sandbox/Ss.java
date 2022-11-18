package sandbox;

public class Ss {
    public static void main(String[] args) {
        for (char el : "0123456789".toCharArray()) {
            int num = el - '0'; //по сути el == (48, 49,..., 57) - 48
            System.out.print(num); // вывод в консоль: 0123456789
        }
        boolean isNum = Character.isDigit('0'); //true

    }

    public static boolean isDigit(char ch) {
        return ch >= 48 && ch <= 57;
    }
}
