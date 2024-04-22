import java.util.Scanner;

public class _4_EjerLab {
  public static void main(String[] args) {
    Scanner insert = new Scanner(System.in);
    int fila;
    int columna;

    // --------- Part 1 --------
    do {
      System.out.print("Ingrese el tamaño de filas y columnas con un espacio entre 1 y 1000: ");
      fila = insert.nextInt();
      columna = insert.nextInt();
    } while (fila < 1 || fila > 1000 || columna < 1 || columna > 1000);

    // --------- Part 2 --------
    int matriz[][] = new int[fila][columna];

    // --------- Part 3 --------
    for (int i = 0; i < fila; i++) {
      System.out.println(" -- Fila " + (i + 1) + " -- ");
      for (int j = 0; j < columna; j++) {
        System.out.print("Columna " + (j + 1) + ": ");
        do{
          matriz[i][j] = insert.nextInt();
        } while (matriz[i][j] < 0 || matriz[i][j] > Math.pow(10,8));
      }
    }

    // --------- Part 4 --------
    int filaDos, filaUno;

    do {
      System.out.print("Ingrese 2 filas para hacer los pares: ");
      filaUno = insert.nextInt();
      filaDos = insert.nextInt();
    } while (filaUno <= 0 || filaUno > fila && filaDos <= 0 || filaDos > fila);

    insert.close();

    // --------- Part 5 --------
    System.out.println("----- Pares de las filas " + filaUno + " ; " + filaDos + " ------");

    for (int i = 0; i < columna; i++) {
      for (int j = 0; j < columna; j++) {
        System.out.print("{" + matriz[filaUno - 1][i] + "," + matriz[filaDos - 1][j] + "} ");
      }
    }

    System.out.println(" "); // Salto de linea

    for (int i = 0; i < columna; i++) {
      for (int j = 0; j < columna; j++) {
        System.out.print("{" + matriz[filaDos - 1][i] + "," + matriz[filaUno - 1][j] + "} ");
      }
    }

    System.out.println(" "); // Salto de linea
  }
  }