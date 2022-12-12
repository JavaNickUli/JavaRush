package sandbox;

public class Task0510 {

    public static int[][] result = new int[10][];
    public static int s = 0;
    public static int k = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {  // цикл для счётчика массивов
            result[i] = new int[i + 1]; // создание массива
            for (int j = 0; j < result[i].length; j++){ // цикл для счетчика номера ячейки в массиве
                result[i][j] = i + j; // заполнение ячеек массива
            }
        }
        for (int[] x : result) {
            if (s > 0 && s < 46){
                System.out.println();
            }
            for (int y : x) {
                if (k != 0 && k != x.length){
                    System.out.print(" ");
                }
                System.out.print(y);
                s++;
                k++;
            }
            k = 0;
        }
    }
}
