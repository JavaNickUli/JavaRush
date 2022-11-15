package sandbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1519 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!(str = reader.readLine()).equals("exit")) {
            try {
                if (str.contains(".")) {
                    print(Double.parseDouble(str));
                } else {
                    int x = Integer.parseInt(str);
                    if (x > 0 && x < 128) {
                        print((short)x);
                    } else {
                        print(x);
                    }
                }
            }catch(Exception e){
                print(str);
            }
        }
        reader.close();
    }
    //напиште тут ваш код

    //Integer.parseInt(reader.readLine());
    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
