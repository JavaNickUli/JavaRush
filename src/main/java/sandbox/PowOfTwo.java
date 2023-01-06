package sandbox;

public class PowOfTwo {

    public static void main(String[] args) {
        calculate(500);
    }

    public static void calculate(int max) {
        int i = 1;
        while ((i <<= 1) <= max) {
            System.out.println(i);
        }
    }
}
