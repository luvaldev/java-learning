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
    //En este caso es un array de tipo int que almacenara 10 datos.

    // ----------------------------------- Metodos ----------------------------- 

    //Imprimir un array
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

    //Ingresar datos a un array
    int num[] = new int[10];

    try (Scanner insert = new Scanner(System.in)) {
      //------- Aqui ingresamos los datos -------
      for(int i = 0; i < 10; i++){
        num[i] = insert.nextInt();
      }
      //---- Lo demás es materia ya explicada ----
    } catch (Exception ex) {
      System.out.println("Ha ocurrido un error : " + ex.getMessage());
    }
    
    //Metodo Burbuja, (Ordenar datos > || <) 

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
  }
}
