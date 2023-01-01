package com.javarush.task.pro.task09.task0908;

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        }
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        String hex = "";
        int count = 3;
        int decimal = 0;
        for (char el : binaryNumber.toCharArray()) {
            if (el != '0' && el != '1') {
                return "";
            }
            decimal += (el - '0') * Math.pow(2, count--);
            if (count < 0) {
                hex += (char) (decimal > 9 ? 'a' + decimal - 10 : '0' + decimal);
                decimal = 0;
                count = 3;
            }
        }
        return hex;
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        }
        String binary = "";
        int count = 3;
        int decimal;
        for (char el : hexNumber.toCharArray()) {
            if (el >= '0' && el <= '9') {
                decimal = el - '0';
            } else if (el >= 'a' && el <= 'f') {
                decimal = 10 + el - 'a';
            } else {
                return "";
            }
            while (count >= 0) {
                int pow2 = (int) Math.pow(2, count--);
                binary += decimal / pow2;
                decimal -= pow2 * (binary.charAt(binary.length() - 1) - '0');
            }
            count = 3;
        }
        return binary;
    }
}
