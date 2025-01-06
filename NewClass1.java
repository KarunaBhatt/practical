 class MatrixOperations {
    
    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Check if the matrices have the same dimensions
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrix addition is not possible. Matrices must have the same dimensions.");
            return new int[0][0]; // Return empty matrix
        }
        
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        
        // Initialize the result matrix
        int[][] result = new int[rows][cols];
        
        // Adding corresponding elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        return result;
    }
    
    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        
        // If number of columns in matrix1 is not equal to number of rows in matrix2, multiplication is not possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible. The number of columns in matrix1 must be equal to the number of rows in matrix2.");
            return new int[0][0]; // Return empty matrix
        }
        
        // Initialize the result matrix
        int[][] result = new int[rows1][cols2];
        
        // Multiplying matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }
    
    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("Matrix is empty.");
            return;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // Example matrices for addition and multiplication
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        // Adding the matrices
        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Sum of Matrices:");
        printMatrix(sumMatrix);
        
        // Multiplying the matrices
        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Product of Matrices:");
        printMatrix(productMatrix);
    }
}
