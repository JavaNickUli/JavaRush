package sandbox;

import java.util.Scanner;

public class Task0508 {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner consol = new Scanner(System.in);
        strings = new String[6];
        int num;
        int k;
        int num1;
        int i;
        String kir = "";//напишите тут ваш код
        for (i = 0; i < strings.length; i++) {
            num = 0;
            num1 = 0;
            strings[i] = consol.nextLine();
            for (k = 0;k < i;k++){
                if (strings[i].equals(strings[k])){
                    num1 = k;
                    num = i;
                }
            }if (num!=0)
            {strings[num] = null;}
            if (strings[i] == null)
            {strings[num1] = null;}}
        for(int u = 0;u < 6;u++){
            kir = kir + strings[u] + ", ";}
        System.out.print(kir);
    }
}
