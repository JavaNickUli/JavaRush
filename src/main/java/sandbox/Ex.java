package sandbox;

public class Ex {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int zm = 0;
        boolean reverse = true;
        while (reverse) {
            reverse = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1])
                    reverse = false;
                zm = array[i];
                array[i] = array[i + 1];
                array[i + 1] = zm;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
