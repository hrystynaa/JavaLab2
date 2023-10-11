package org.example;

public class MatrixCalculator {
    private final int m;
    private final int n;
    private int sum = 0;
    private final short[][] matrixA;
    private final short[][] matrixB;
    private final short[][] matrixC;
    public MatrixCalculator(int m, int n) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Error: Matrix dimensions must be positive!");
        }
        this.m = m;
        this.n = n;
        this.matrixA = new short[m][n];
        this.matrixB = new short[m][n];
        this.matrixC = new short[m][n];
    }

    private void setMatrix(short[][] matrix, short min, short max){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               matrix[i][j] = (short)((Math.random()*(max - min + 1)) + min);
            }
        }
    }
    private void printMatrix(short[][] matrix){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void setMatrixA(short min, short max){
        setMatrix(matrixA,min,max);
        System.out.println("Matrix A:");
        printMatrix(matrixA);
    }
    public void setMatrixB(short min, short max){
        setMatrix(matrixB,min,max);
        System.out.println("Matrix B:");
        printMatrix(matrixB);
    }
    public void calculate(){
        for (int i = 0; i < m; i++) {
            int minVal = matrixA[i][0] + matrixB[i][0];
            for (int j = 0; j < n; j++) {
                matrixC[i][j] = (short)(matrixA[i][j] + matrixB[i][j]);
                if (minVal > matrixC[i][j]) {
                    minVal = matrixC[i][j];
                }
            }
            sum += minVal;
        }
        System.out.println("A + B:");
        printMatrix(matrixC);
        System.out.print("Sum = " + sum);
    }
}
