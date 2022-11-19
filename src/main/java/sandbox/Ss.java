package sandbox;

import java.util.ArrayList;

public class Ss {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>() {{
            add("роза");
            add("лира");
            add("лоза");
        }};
        strings = fix2(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        int actualSize = strings.size();
        for (int i = 0; i < actualSize; i++) {
            String el = strings.get(i);
            boolean contR = el.contains("р");
            boolean contL = el.contains("л");
            if (contR && !contL) {
                strings.remove(i--);
                actualSize--;
            }
            if (!contR && contL) {
                strings.add(el);
            }
        }
        return strings;
    }

    public static ArrayList<String> fix2(ArrayList<String> strings) {
        ArrayList<String> newArray = new ArrayList<>();
        for (String el : strings) {
            boolean contR = el.contains("р");
            boolean contL = el.contains("л");
            if (contR && !contL) {
                continue;
            }
            if (!contR && contL) {
                newArray.add(el);
            }
            newArray.add(el);
        }
        return newArray;
    }
}
