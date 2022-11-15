package sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2025 {

    public static long[] getNumbers(long N) {

        List<Long> list = new ArrayList<>();
        for (long i = 1; i < N; i++) {
            String number = String.valueOf(i);
            long sum = 0;
            for (int digit : number.toCharArray()) {
                if (digit == 0) continue;
                sum += digit == 1 ? 1 : (long) Math.pow((digit - '0'), number.length());
            }
            if (sum == i) list.add(i);
        }
        long[] result = new long[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
//        long[] result;
//        List<Long> list = new ArrayList<>();
//
//        for (long i = 1; i < N; i++) {
//            int countDigit = String.valueOf(i).length();
//            long res = 0;
//            for (int j = 0; j < countDigit; j++) {
//                String num = String.valueOf(i);
//                long tmp = Character.getNumericValue(num.charAt(j));
//                if (tmp == 0) continue;
//                long mult = 1;
//                for (int k = 0; k < countDigit; k++) {
//                    mult *= tmp;
//                }
//                res += mult;
//            }
//            if (i == res) list.add(i);
//        }
//
//        result = new long[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            result[i] = list.get(i);
//        }
//        return result;
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
