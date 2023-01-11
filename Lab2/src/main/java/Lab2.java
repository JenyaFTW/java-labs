public class Lab2 {
    public static void displayMatrix(byte[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
                if (j == matrix[i].length - 1) {
                    System.out.print("\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        /*

        Zalikova: 0526
        C5 = 1 (C=Bт)
        C7 = 1 (byte)
        C11 = 9 (Знайти середнє значення елементів кожного стовпчика матриця)

         */

        byte matrixB[][] = {
                {6, 5, 4, 3, 2},
                {12, 6, 3, 2, 1, 5},
                {3, 5, -2, 4, 9}
        };

        for (int i = 1; i < matrixB.length; i++) {
            if (matrixB[0].length != matrixB[i].length) {
                System.err.println("Error: Row has different length than others");
                return;
            }
        }

        System.out.println("Initial matrix:");
        Lab2.displayMatrix(matrixB);

        // First step: Transpose matrix
        int rows = matrixB.length;
        int cols = matrixB[0].length;
        byte matrixC[][] = new byte[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                matrixC[i][j] = matrixB[j][i];
            }
        }

        System.out.println("\nMatrix after transposing:");
        Lab2.displayMatrix(matrixC);

        System.out.println("\nAverages of each column:");
        for (int i = 0; i < matrixC[0].length; i++) {
            byte total = 0;
            for (int j = 0; j < matrixC.length; j++) {
                total += matrixC[j][i];
            }
            System.out.printf("Col = %d | Avg = %.1f\n", i, (float) total / matrixC.length);
        }
    }
}