package sandbox;

import java.util.Arrays;

public class PiratesWorkbench {

    public static String[] piratesDB = new String[]{
            "Drax",
            "Yondu Udonta",
            "Maz Kanata",
            "キャプテン・ハーロック",
            "Star-Lord",
            "Christopher Summers",
            "Крысс",
            "Весельчак У",
            "Nebula",
            "Rocket",
            "Han Solo",
            "boba Fett"
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(piratesDB));
        corruptDB();
        addTwoNames();
        System.out.println(Arrays.toString(piratesDB));
    }

    public static void corruptDB() {
        for (int i = 0; i < piratesDB.length; i++) {
            piratesDB[i] = piratesDB[i].replaceAll("b", "\b");
        }
    }

    public static void addTwoNames() {
        String[] newBase = Arrays.copyOf(piratesDB, piratesDB.length + 2);
        newBase[12] = "Рыжий Амиго";
        newBase[13] = "Одноглазый Диего";
        piratesDB = newBase;
    }
}
