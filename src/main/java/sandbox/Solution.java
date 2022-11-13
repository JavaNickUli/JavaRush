package sandbox;

public class Solution {

    static int m = 5;
    static int n = 5;
    static int[][] matrix = new int[m][n];

    public static void main(String[] args) {
        fillMatrixRandom(-99, 100);
        displayMatrix();
        rebuildMatrix(findPositiveColumn());
        displayMatrix();
    }

    public static void fillMatrixRandom(int from, int to) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * (to - from) + from);
            }
        }
    }

    public static void displayMatrix() {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print((cell < 0 ? cell < -9 ? " " : "  " : cell > 9 ? "  " : "   ") + cell);
            }
            System.out.println();
        }
        System.out.println("----".repeat(n));
    }

    public static int findPositiveColumn() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] < 0) break;
                if (j == m - 1) return i;
            }
        }
        return -1;
    }

    public static void rebuildMatrix(int column) {
        if (column == -1) return;
        int[][] newMatrix = new int[m][n - 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                newMatrix[i][j] = matrix[i][j < column ? j : j + 1];
            }
        }
        matrix = newMatrix;
    }
}

