package Ejercicios.ProyetoRetos;
import java.util.Scanner;

public class _4_EjerLab {
  public static void main(String[] args) {
    Scanner insert = new Scanner(System.in);
    int fila;
    int columna;

    /**
     * Insertar filas para la formacion de la matriz cumpliendo
     * con la condicion entre 1 y 1000.
     */
    do {
      System.out.print("Ingrese el tamaño de filas entre 1 y 1000: ");
      fila = insert.nextInt();
    } while (fila < 1 || fila > 1000);

    /**
     * Insetar columnas para la formacion de la matriz cumpliendo
     * con la condicion
     */
    do {
      System.out.print("Ingrese el tamaño de columnas entre 1 y 1000: ");
      columna = insert.nextInt();
    } while (columna < 1 || columna > 1000);

    // Creamos matriz
    int matriz[][] = new int[fila][columna];

    // Llenamos la matriz
    for (int i = 0; i < fila; i++) {
      System.out.println(" -- Fila " + (i + 1) + " -- ");
      for (int j = 0; j < columna; j++) {
        System.out.print("Columna " + (j + 1) + ": ");
        matriz[i][j] = insert.nextInt();
      }
    }

    String hola;

    // Cerramos el scanner
    insert.close();

    System.out.println(" --- Matriz 2x" + columna + " ordenada por pares --- ");
    /**
     * Almacenamos los valores pares encontrados en la primera y la segunda fila
     */

    int matrizOrdenada[][] = new int[2][columna];
    int a = 0;

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < columna; j++) {
        if (matriz[i][j] % 2 == 0) {
          matrizOrdenada[i][a] = matriz[i][j];
          a++;
        }
      }
      // Cuando termine de recorrer la j se resetea el a
      a = 0;
    }

    // Imprimimos matriz ordenada de pares
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < columna; j++) {
        System.out.print(matrizOrdenada[i][j] + " ");
      }
      System.out.println(" ");
    }

  }
}