package ProyectoResumen;

import java.util.*;

public class _10_Arrays {
  public static void main(String[] args) {
    // ------------------------- Arrays --------------------------------------
    /**
     * Los arrays son una forma eficiente para la creacion y almacenamiento
     * de datos en una sola variable, por ejemplo al momento de hacer un
     * programa que necesitemos almacenar muchos numeros, deberiamos crear
     * muchas variables como tal pero los arrays con una simple declaracion
     * tiene la misma funcionalidad, un dato importante de un array es que
     * si por ejemplo el tamaño del array es de [10], es importante mencionar
     * que el inicio del array sera desde 0 hasta 9. (Ya se muestran ejemplos)
     * 
     * Estructura: (Se puede considerar una caja que almacena n datos)
     * 
     * TipoDeDato nombre[] = new TipoDeDato[tamaño];
     * 
     */

    // Ejemplo:

    int numeros[] = new int[10];
    // En este caso es un array de tipo int que almacenara 10 datos.

    // ----------------------------------- Metodos -----------------------------

    // Imprimir un array
    for (int i = 0; i < 10; i++) {
      System.out.println(numeros[i]);
    }
    /**
     * Aqui hacemos un recorrido desde i = 0 hasta i < 10; esto con la finalidad
     * de que la variable i en el for haga un recorrido inicial desde 0 hasta
     * un numero menor que el tamaño del array, esto se debe a que como el
     * primer dato en el array se posiciona inicialmente en el 0 si tenemos 10
     * datos, siempre sera uno menos que el tamaño.
     */

    // Ingresar datos a un array
    int num[] = new int[10];

    try (Scanner insert = new Scanner(System.in)) {
      // ------- Aqui ingresamos los datos -------
      for (int i = 0; i < 10; i++) {
        num[i] = insert.nextInt();
      }
      // ---- Lo demás es materia ya explicada ----
    } catch (Exception ex) {
      System.out.println("Ha ocurrido un error : " + ex.getMessage());
    }

    // Metodo Burbuja, (Ordenar datos > || <)

    int edades[] = new int[10];

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (edades[i] > edades[j]) {
          int aux = edades[i];
          edades[i] = edades[j];
          edades[j] = aux;
        }
      }
    }

    /**
     * El metodo burbuja esta basado en 2 ciclos for los cuales tienen
     * la utilidad de recorrer el array (edades[]) con la finalidad
     * de comprar en el if(edades[i] > edades[j]) comprar un dato inicial
     * que sera el del [i], por ejemplo edades[0] = 10, entonces esa edad
     * la ira comparando con todo el otro recorrido [j], por lo cual si
     * encuentra que la posicion [i] es mayor que la [j], entrara en el if
     * y hara una modificacion cambiando de lugar en el array principal.
     */

    // ----------------------- Arrays Bidimensionales ---------------------------
    /**
     * Un array bidimensional es un array que tiene una estructura de filas y
     * columnas
     * por ejemplo si tenemos un array de 3x3, tendremos 3 filas y 3 columnas, esto
     * se puede considerar como una matriz, en la cual se puede almacenar datos de
     * forma ordenada.
     * 
     * Estructura:
     * int nombre[][] = new int[filas][columnas];
     * 
     * Un ejemplo visual seria:
     * 
     * 1 2 3 fila 1
     * 4 5 6 fila 2
     * 7 8 9 fila 3
     * 
     * Donde tendriamos 3 filas y 3 columnas, las columnas se pueden considerar como
     * los datos que se almacenan en cada fila.
     */

    // Ejemplo:
    int matriz[][] = new int[3][3];

    // Ingresar datos a la matriz
    try (Scanner insert = new Scanner(System.in)) {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          matriz[i][j] = insert.nextInt();
        }
      }
    } catch (Exception ex) {
      System.out.println("Ha ocurrido un error : " + ex.getMessage());
    }

    /**
     * En este caso se hace un recorrido de 2 ciclos for, el primero recorre las
     * filas
     * y el segundo las columnas, esto con la finalidad de que se pueda ingresar
     * datos
     * de forma ordenada, por ejemplo si se ingresa un dato en la fila 1 columna 1,
     * se
     * almacenara en la posicion matriz[0][0], esto se debe a que el array comienza
     * desde
     * 0.
     */

    // Imprimir matriz:
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println(); // Salto de linea al momento de imprimir toda la fila.
    }

    // Ordenar matriz con el metodo burbuja:

    for (int x = 0; x < 3; x++) {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (matriz[x][i] > matriz[x][j]) {
            int aux = matriz[x][i];
            matriz[x][i] = matriz[x][j];
            matriz[x][j] = aux;
          }
        }
      }
    }

    /** 
     * En este caso se hace un recorrido de 3 ciclos for, el primero recorre las
     * filas de la matriz, el segundo recorre las columnas y el tercero hace la
     * comparacion de los datos, esto con la finalidad de que se pueda ordenar
     * de forma ascendente o descendente, en este caso se ordena de forma descendente
     * por lo cual se compara si el dato de la fila [x] columna [i] es mayor que
     * el dato de la fila [x] columna [j], si es asi se hace un cambio de lugar
     * en la matriz. En caso de querere ordenar los datos de menor a mayor solo
     * se debe cambiar el signo de mayor a menor en el if.
    */
  }
}
