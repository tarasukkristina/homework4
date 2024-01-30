package by.it.academy.homework4;

public class Matrix {
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
        int row1 = 0;
        int row2 = 1;
        TransposeAndPrintMatrix(row, column, row1, row2, matrix);
    }

    public static void TransposeAndPrintMatrix(int row, int column, int row1, int row2, int[][] matrix) {
        int[][] newMatrix = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        int[] temp = newMatrix[row1];
        newMatrix[row1] = newMatrix[row2];
        newMatrix[row2] = temp;

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
