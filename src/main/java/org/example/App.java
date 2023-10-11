package org.example;

public class App {
  public static void main(String[] args) {
    MatrixCalculator matrixCalculator = new MatrixCalculator(3,3);
    matrixCalculator.setMatrixA((short)-30,(short)30);
    matrixCalculator.setMatrixB((short)-40,(short)40);
    matrixCalculator.calculate();
  }
}
