package sandbox;

public class Task0407 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 100) {
            if (count % 3 != 0)
                sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
