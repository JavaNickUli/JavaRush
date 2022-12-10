package sandbox;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ee {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        print(stringList);
        print(integerList);
        print(objectList);
        print(linkedList);
    }

    public static void print(List<?> list) {
        for (var el : list) {
            System.out.println(el);
        }
    }
}
