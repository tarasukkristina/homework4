public class MatrixCorrect {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 1},
                {2, 3},
                {4, 5},
                {6, 7},
                {8, 9},
        };

        int row = matrix.length;
        int column = matrix[0].length;

        transposeAndPrintMatrix(row, column, matrix);
    }

    public static void transposeAndPrintMatrix(int row, int column, int[][] matrix) {
        int[][] newMatrix = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
