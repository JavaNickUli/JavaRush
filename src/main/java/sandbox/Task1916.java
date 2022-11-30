package sandbox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Task1916 {
    public static List<LineItem> lines = new ArrayList<LineItem>();
    public static List<String> fileList1 = new ArrayList<>();
    public static List<String> fileList2 = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        try (BufferedReader bR1 = new BufferedReader(new InputStreamReader(System.in))) {
            String path1 = bR1.readLine();
            String path2 = bR1.readLine();

            try (BufferedReader bR2 = new BufferedReader(new FileReader(path1));
                 BufferedReader bR3 = new BufferedReader(new FileReader(path2))) {

                while (bR2.ready()) {
                    fileList1.add(bR2.readLine());
                }

                while (bR3.ready()) {
                    fileList2.add(bR3.readLine());
                }

                int forVal = Math.min(fileList1.size(), fileList2.size()) +
                        (Math.max(fileList1.size(), fileList2.size()) -
                                Math.min(fileList1.size(), fileList2.size()));

                for (int i = 0; i < forVal; i++) {
                    if (fileList1.size() > i + 1 && fileList2.size() > i + 1) {
                        if (!fileList1.get(i).equals(fileList2.get(i)) &&
                                fileList1.get(i).equals(fileList2.get(i + 1))
                        ) {
                            fileList1.add(i, "ххххххХ");
                        } else if (!fileList1.get(i).equals(fileList2.get(i)) &&
                                !fileList1.get(i).equals(fileList2.get(i + 1))) {
                            fileList2.add(i, "ххххххХ");
                        }
                    }
                }

                if (fileList1.size() > fileList2.size()) fileList2.add("ххххххХ");
                else if (fileList2.size() > fileList1.size()) fileList1.add("ххххххХ");

                System.out.println(fileList1);
                System.out.println(fileList2);

                for (int i = 0; i < fileList1.size(); i++) {
                    if (fileList1.get(i).equals(fileList2.get(i))) {
                        lines.add(new LineItem(Type.SAME, fileList1.get(i)));
                    } else if (fileList2.get(i).equals("ххххххХ")) {
                        lines.add(new LineItem(Type.REMOVED, fileList1.get(i)));
                    } else if (fileList1.get(i).equals("ххххххХ")) {
                        lines.add(new LineItem(Type.ADDED, fileList2.get(i)));
                    }
                }

            }
        }
        for (Task1916.LineItem item : lines) {
            System.out.println(item.type + " " + item.line);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

//        @Override
//        public String toString() {
//            String type = null;
//            switch (this.type) {
//                case ADDED:
//                    type = "ADDED:   ";
//                    break;
//                case REMOVED:
//                    type = "REMOVED: ";
//                    break;
//                case SAME:
//                    type = "SAME:    ";
//                    break;
//            }
//            return type + line + "\n";
//        }
    }
}

