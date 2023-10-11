package org.example;

public class MatrixCalculator {
    private int m;
    private int n;
    private short matrixA[][];
    private short matrixB[][];
    public MatrixCalculator(int m, int n) {
        this.m = m;
        this.n = n;
        this.matrixA = new short[m][n];
        this.matrixB = new short[m][n];
    }

    private void setMatrix(short matrix[][], short min, short max){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               matrix[i][j] = (short)((Math.random()*(max - min + 1)) + min);
            }
        }
    }
    private void printMatrix(short matrix[][]){
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
    


}
