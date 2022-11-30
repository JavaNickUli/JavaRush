package com.javarush.task.task20.task2012;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Solution {

    public static String greeting = "Hello world";

    public static class OutputToConsole implements Externalizable {

        private int counter;

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(counter);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            counter = in.readInt();
        }

        public OutputToConsole() {
        }

        public OutputToConsole(int counter) {
            this.counter = counter;
        }

        public void printMessage() {
            for (int i = 0; i < counter; i++) {
                System.out.println(greeting);
            }
        }
    }

    public static void main(String[] args) {
    }
}
