import java.util.Scanner;

public class MultiplicacionMatrices {
  // ------------- Part 1 -----------------
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int filasA = scanner.nextInt();
    int columnasA = scanner.nextInt();
    int[][] matrizA = new int[filasA][columnasA];
    ingresarMatriz(scanner, matrizA);

    int filasB = scanner.nextInt();
    int columnasB = scanner.nextInt();
    int[][] matrizB = new int[filasB][columnasB];
    ingresarMatriz(scanner, matrizB);

    if (columnasA != filasB) {
      return;
    }
    int[][] resultado = multiplicarMatrices(matrizA, matrizB);

    imprimirMatriz(resultado);
  }
  
  // ------------- Part 2 -----------------
  public static void ingresarMatriz(Scanner scanner, int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        matriz[i][j] = scanner.nextInt();
      }
    }
  }
  
  // ------------- Part 3 -----------------
  public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
    int filasA = matrizA.length;
    int columnasA = matrizA[0].length;
    int filasB = matrizB.length;
    int columnasB = matrizB[0].length;

    int[][] resultado = new int[filasA][columnasB];
    for (int i = 0; i < filasA; i++) {
      for (int j = 0; j < columnasB; j++) {
        for (int k = 0; k < columnasA; k++) {
          resultado[i][j] += matrizA[i][k] * matrizB[k][j];
        }
      }
    }

    return resultado;
  }
  
  // ------------- Part 4 -----------------
  public static void imprimirMatriz(int[][] matriz) {
    for (int[] fila : matriz) {
      for (int elemento : fila) {
        System.out.print(elemento + " ");
      }
      System.out.println();
    }
  }
}
