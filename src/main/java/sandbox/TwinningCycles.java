package sandbox;

import java.util.Arrays;

public class TwinningCycles {

    public static void main(String[] args) {
        int[][] test0 = new int[5][5];
        int[][] test1 = new int[5][5];
        int[][] test2 = new int[5][5];
        int[][] exp = new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        fillArray(test0, 1);
        System.out.println(Arrays.deepEquals(test0, exp));
        fillArrayWithEndLine(test1, 1);
        System.out.println(Arrays.deepEquals(test1, exp));
    }

    public static void fillArray(int[][] a, int b) {
        for (int i = 0, j = i; i < a.length; j = ++j < a[i].length ? j : i - i++) {
            a[i][j] = b;
        }
    }

    public static void fillArrayWithEndLine(int[][] a, int b) {
        for (int i = 0, j = i; i < a.length; j++) {
            a[i][j] = b;
            j = j < a[i].length - 1 ? j : i - ++i;
        }
    }

    public static void fillArrayWhile(int[][] a, int b) {
        int i = 0, j = i;
        for (; i < a.length; j = ++j < a[i].length ? j : i - i++) {
            a[i][j] = b;
        }
    }
}
