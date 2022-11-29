package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try {
            File tempFile = File.createTempFile("C:/1/test", null);
            OutputStream outputStream = new FileOutputStream(tempFile);
            InputStream inputStream = new FileInputStream(tempFile);
            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setFirstName("Fred");
            user.setLastName("Miles");
            user.setBirthDate(new GregorianCalendar(2000, Calendar.JUNE, 4).getTime());
            user.setMale(true);
            user.setCountry(User.Country.OTHER);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();
            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            assert javaRush.equals(loadedObject);
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {

        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter saver = new PrintWriter(outputStream);
            for (User user : users) {
                saver.println(user.getFirstName() + ":" + user.getLastName() + ":" +
                        user.getBirthDate().getTime() + ":" + user.isMale() + ":" + user.getCountry());
            }
            saver.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader loader = new BufferedReader(new InputStreamReader(inputStream));
            while (loader.ready()) {
                String[] line = loader.readLine().split(":");
                User user = new User();
                user.setFirstName(line[0]);
                user.setLastName(line[1]);
                user.setBirthDate(new Date(Long.parseLong(line[2])));
                user.setMale("true".equals(line[3]));
                user.setCountry(User.Country.valueOf(line[4]));
                users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            JavaRush javaRush = (JavaRush) o;
            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
