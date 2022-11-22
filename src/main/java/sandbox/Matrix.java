package sandbox;

public class Matrix {

    public static void main(String[] args) {
        int m = 9;
        int n = 6;
        int r = 100;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * r);
            }
        }
        int sum = 0;
        for (int i = 1; i < matrix.length; i += 2) {
            for (int j = 1; j < matrix[i].length; j += 2) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
