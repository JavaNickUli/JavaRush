package com.javarush.task.task20.task2017;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class Solution implements Serializable {

    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            return (A) objectStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {
    }
}
