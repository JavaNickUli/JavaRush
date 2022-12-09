package sandbox;

import java.util.Arrays;
import java.util.TreeSet;

/*
Алгоритмы-числа
*/

public class Solution2025 {
    static long[][] powArray = new long[10][19];
    static int[] max9Array;
    static TreeSet<Long> treeSet = new TreeSet<>();
    static long maxLong;
    static int pow;

    public static long powNumsSum(int[] I, int pow) {
        long x = 0;
        for (int n = 0; n < I.length; n++) {
            x = powArray[I[n]][pow - 1] + x;
            if (x < 0) {
                return 0;
            }
        }
        return x;
    }

    public static int numLeight(long L) {
        int count = 0;
        while (L != 0) {
            L = L / 10;
            count++;
        }
        return count;
    }

    public static int[] numToArray(long J) {
        int count = numLeight(J);
        int[] tempArray = new int[count];
        for (int z = count - 1; z >= 0; z--) {
            tempArray[z] = (int) (J % 10);
            J = J / 10;
        }
        return tempArray;
    }

    public static void equols(int[] max9Array) {
        pow = max9Array.length;
        long sum;
        long sumRev;
        sum = powNumsSum(max9Array, pow);
        sumRev = powNumsSum(numToArray(sum), numLeight(sum));
        if (sum == sumRev && sum < maxLong && sum != 0) {
            treeSet.add(sum);
        }
        for (int i = 0; i < max9Array.length; i++) {
            if (max9Array[i] == 0) {
                if (max9Array[i] != 0){
                    break;
                }
                pow = pow - 1;
                sum = powNumsSum(max9Array, pow);
                sumRev = powNumsSum(numToArray(sum), numLeight(sum));
                if (sum == sumRev && sum < maxLong && sum != 0) {
                    treeSet.add(sum);
                }
            }
        }
    }

    private static boolean decrementArray(int[] A) {
        int index = 0;
        while (index < A.length && A[index] == 0) {
            index++;
        }
        if (index + 1 == A.length && A[index] == 1) {
            return false;
        }
        Arrays.fill(A, 0, index + 1, A[index] - 1);
        return true;
    }

    public static long[] getNumbers(long N) {

        long[] result;
        int leightN = numLeight(N);
        maxLong = N;

        for (int a = 0; a < powArray.length; a++) {
            powArray[a][0] = a;
            for (int y = 0; y < powArray[0].length - 1; y++) {
                powArray[a][y + 1] = powArray[a][0] * powArray[a][y];
            }
        }

        max9Array = new int[leightN];

        for (int z = leightN - 1; z >= 0; z--) {
            max9Array[z] = 9;
        }

        do {
            equols(max9Array);
        } while (decrementArray(max9Array));

        int i = 0;
        result = new long[treeSet.size()];
        for (Long element : treeSet) {
            result[i++] = element;
        }
        treeSet.clear();
        return result;
    }

    public static void main(String[] args) {

        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(10)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}

