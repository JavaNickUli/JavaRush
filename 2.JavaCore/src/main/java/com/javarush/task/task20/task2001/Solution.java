package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        try {
            File tempFile = File.createTempFile("C:/1/test", null);
            OutputStream outputStream = new FileOutputStream(tempFile);
            InputStream inputStream = new FileInputStream(tempFile);
            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99),
                    new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();
            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            assert ivanov.equals(somePerson);
        } catch (IOException e) {
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {

        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Human human = (Human) o;
            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            BufferedWriter saver = new BufferedWriter(new OutputStreamWriter(outputStream));
            String ln = System.lineSeparator();
            saver.write(name + ln);
            for (Asset el : assets) {
                saver.write(el.getName() + ": " + el.getPrice() + ln);
            }
            saver.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader loader = new BufferedReader(new InputStreamReader(inputStream));
            name = loader.readLine();
            while (loader.ready()) {
                String[] line = loader.readLine().split(": ");
                assets.add(new Asset(line[0], Double.parseDouble(line[1])));
            }
        }
    }
}
