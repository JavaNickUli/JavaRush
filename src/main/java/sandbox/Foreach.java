package sandbox;

public class Foreach {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {8, 7, 6, 5},
                {4, 3, 2, 1},
        };

        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                int cell = row[j];
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
