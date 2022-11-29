package com.javarush.task.task20.task2004;

import java.io.*;

public class Solution {

    public static void main(String[] args) {
        try {
            File tempFile = File.createTempFile("C:/1/test", null);
            OutputStream outputStream = new FileOutputStream(tempFile);
            InputStream inputStream = new FileInputStream(tempFile);
            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();
            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;
            loadedObject.load(inputStream);
            assert classWithStatic.equals(loadedObject);
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class ClassWithStatic {

        public static String staticString = "This is a static test string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter saver = new PrintWriter(outputStream);
            saver.println(staticString);
            saver.println(i);
            saver.println(j);
            saver.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader loader = new BufferedReader(new InputStreamReader(inputStream));
            staticString = loader.readLine();
            i = Integer.parseInt(loader.readLine());
            j = Integer.parseInt(loader.readLine());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ClassWithStatic that = (ClassWithStatic) o;
            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
