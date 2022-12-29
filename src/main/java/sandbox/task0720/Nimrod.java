package sandbox.task0720;

public class Nimrod {
    public static int laser = 100000;
    public static int rocket = 10000;
    public static int angelicaKiss;
    public int health = 1000000;

    public void defend(int AA) {
        health = health - AA;
    }

    public int attack() {
        return rocket;
    }
}
