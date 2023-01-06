package sandbox;

import java.util.Arrays;
import java.util.TreeSet;

public class Task2025 {

    private static int depth;
    private static int[] digits;
    private static long maxValue;
    private static long[][] pows;
    private static TreeSet<Long> grandResult;

    public static long[] getNumbers(long N) {
        long[] result = null;
        int maxDepth = (int) Math.ceil(Math.log10(N));       // maximum long depth = 19 on Long.MAX_VALUE
        if (maxDepth > 0) {
            maxValue = N;
            digits = new int[maxDepth];
            pows = new long[11][maxDepth];
            grandResult = new TreeSet<>();
            for (int i = 1; i < pows.length; i++) {
                pows[i][0] = i;
                for (int j = 1; j < pows[i].length; j++) {
                    pows[i][j] = pows[i][j - 1] * i;
                }
            }
            for (depth = 0; depth < maxDepth; ++depth) {
                capacityIteration(0, depth);
            }
            int counter = 0;
            result = new long[grandResult.size()];
            for (long value : grandResult) {
                result[counter++] = value;
            }
        }
        return result;
    }

    public static void capacityIteration(int start, int capacity) {
        for (start = start == 0 && capacity == 0 ? 1 : start; start <= 9; ++start) {
            digits[capacity] = start;
            if (capacity > 0) {
                capacityIteration(start, capacity - 1);
            } else {
                long sumPows = 0;
                for (int i = 0; i <= depth; ++i) {
                    sumPows += pows[digits[i]][depth];
                }
                char[] chars = String.valueOf(sumPows).toCharArray();
                if (chars.length - 1 == depth && sumPows < maxValue) {
                    firstBlock:
                    {
                        for (int i = 0; i <= depth; ++i) {
                            secondBlock:
                            {
                                for (int j = 0; j < chars.length; j++) {
                                    if (digits[i] + 48 == chars[j]) {
                                        chars[j] = 0;
                                        break secondBlock;
                                    }
                                }

                                break firstBlock;
                            }
                        }
                        grandResult.add(sumPows);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
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
