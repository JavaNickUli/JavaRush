package sandbox;

public class Outer {

    private int outerX;
    private static int outerY;

    public Outer(int x) {
        outerX = x;
    }

    public static void main(String[] args) {
        new Outer(2).show();
    }

    private static void init(int y) {
        outerY = y;
    }

    public void show() {
        Inner inner = new Inner(5);
        System.out.println("Inner x: " + inner.innerX);
        System.out.println("Inner y: " + Inner.innerY);
        init(3);
        inner.display();
    }

    private class Inner {

        private int innerX;
        private static final int innerY = 6;

        private Inner(int x) {
            innerX = x;
        }

        private void display() {
            System.out.println("Outer x: " + outerX);
            System.out.println("Outer y: " + outerY);
        }
    }
}
