package sandbox;

public class Work1 {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        display(array);
        System.out.println();
        f(array);
        display(array);
        new Outer(2).show();
//        List list = new List();
//        list.insertTail(0);
//        list.insertTail(1);
//        list.insertTail(2);
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
    }

    static void display(int[][] array) {
        for (int[] row : array) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    static void f(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j > i) {
                    int k = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = k;
                }
            }
        }
    }
}
