package com.javarush.task.task20.task2021;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Solution implements Serializable {

    public static class SubSolution extends Solution {

        private void writeObject(ObjectOutputStream out) throws Exception {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream in) throws Exception {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {
    }
}
