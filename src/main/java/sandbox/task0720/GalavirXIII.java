package sandbox.task0720;

public class GalavirXIII {
    public static int superWeapon = Integer.MAX_VALUE;
    public double health = Double.MAX_VALUE;

    public void defend(double AA) {
        health = health - (superWeapon / AA);
    }

    public int attack() {
        return superWeapon;
    }
}
