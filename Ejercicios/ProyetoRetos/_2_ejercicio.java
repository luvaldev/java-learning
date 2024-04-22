/** 
 * El programa debe recibir como primer argumento la cantidad 
 * de números (n) a revisar y en segundo lugar deberá recibir una 
 * serie de números enteros de largo previamente ingresado (n):
 * 
 * Input: 5 2 6 28 3
 * 
 * Output: 28
*/


import java.util.Scanner;

public class _2_Ejercicio {
  public static void main(String[] args) {
    Scanner insert = new Scanner(System.in);

    int n;
    // Inserte cantidad de numeros
    System.out.print("Ingrese cantidad: ");
    n = insert.nextInt();
    // Declaro el array
    int array[] = new int[n];

    // Preguntar por los numeros
    for (int i = 0; i < n; i++) {
      System.out.print("Ingrese el lugar " + (i + 1) + ": ");
      array[i] = insert.nextInt();
    }
    insert.close();

    // Ordenar datos
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (array[i] > array[j]) {
          int aux = array[i];
          array[i] = array[j];
          array[j] = aux;
        }
      }
    }

    System.out.println(array[0]);
  }
}
