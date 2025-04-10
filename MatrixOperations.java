import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aditya Agniesh"+ " " +"22BCS14644");
        
        
        System.out.print("Enter the number of rows and columns of the matrices: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        
        
        System.out.println("Enter elements of first matrix:");
        readMatrix(scanner, matrix1);
        
      
        System.out.println("Enter elements of second matrix:");
        readMatrix(scanner, matrix2);
        
     
        System.out.println("Matrix Addition:");
        printMatrix(addMatrices(matrix1, matrix2));
        
        System.out.println("Matrix Subtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2));
        
        System.out.println("Matrix Multiplication:");
        printMatrix(multiplyMatrices(matrix1, matrix2, rows, cols));
        
        scanner.close();
    }
    
    private static void readMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    
    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }
    
    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

