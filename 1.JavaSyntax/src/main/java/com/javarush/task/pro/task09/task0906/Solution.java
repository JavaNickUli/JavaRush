package com.javarush.task.pro.task09.task0906;

public class Solution {

    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binary = "";
        while (decimalNumber > 0) {
            binary = decimalNumber % 2 + binary;
            decimalNumber /= 2;
        }
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        }
        int decimal = 0;
        int i = binaryNumber.length() - 1;
        for (char el : binaryNumber.toCharArray()) {
            decimal += (el - '0') * Math.pow(2, i--);
        }
        return decimal;
    }
}
