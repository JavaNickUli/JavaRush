package com.javarush.task.task22.task2208;

import java.util.Map;

public class Solution {

    public static void main(String[] args) {
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> el : params.entrySet())
            if (el.getValue() != null) {
                sb.append(sb.length() == 0 ? "" : " and ").append(el.getKey()).append(" = '").append(el.getValue()).append("'");
            }
        return sb.toString();
    }
}
