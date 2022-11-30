package com.javarush.task.task21.task2101;

public class Solution {

    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);
        print(mask);
        print(netAddress);
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netAddress = new byte[4];
        for (int i = 0; i < netAddress.length; i++) {
            netAddress[i] = (byte) (ip[i] & mask[i]);
        }
        return netAddress;
    }

    public static void print(byte[] bytes) {
        StringBuilder byteLine = new StringBuilder();
        for (byte aByte : bytes) {
            for (int i = 128; i > 0; i >>= 1) {
                byteLine.append((aByte & i) == 0 ? "0" : "1");
            }
            byteLine.append(" ");
        }
        System.out.println(byteLine);
    }
}
