package sandbox;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Task2025 {

    public static long[] getNumbers(long N) {
        int numberLength = String.valueOf(N).length();
        long[][] powTable = new long[10][numberLength + 1];
        for (int i = 0; i < powTable.length; i++) {
            for (int j = 0; j < powTable[0].length; j++) {
                powTable[i][j] = i;
                for (int k = 1; k < j; k++) {
                    powTable[i][j] *= i;
                }
            }
        }
        Set<Long> numbersOfArmstrong = new TreeSet<>();
        long sum = 0;
        int[] numsArray = new int[numberLength];
        numsArray[numsArray.length - 1] = 1;
        while (sum < N) {
            sum = 0;
            for (int num : numsArray) {
                sum += powTable[num][numberLength];
            }
        }
//        int[] sumOfSign = new int[numsArray.length];
//        int delta = numsArray.length - sumLine.length();
//        for (int j = 0; j < sumLine.length(); j++) {
//            sumOfSign[j + delta] = sumLine.charAt(j) - '0';
//        }
        return null;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
