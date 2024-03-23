/** 
 * Cree un programa en Java el cual solicite por teclado
 * el ingreso de una base y una altura y luego realice
 * el area de aquel triangulo e imprimalo.
*/

package Ejercicios.ProyectoEjersResumen;

import java.util.Scanner; //Necesario importar libreria Scanner

public class _1_Ejer {
  // Generamos metodo main
  public static void main(String[] args) {
    // Declaramos la entrada de datos con el nombre "insert" o cualquier otro
    Scanner insert = new Scanner(System.in);

    // Imprimimos linea de codigo + una variable para almacenar la base
    System.out.print("Ingrese una base: ");
    int base = insert.nextInt();

    // Misma situacion pero para la altura
    System.out.print("Ingrese una altura: ");
    int altura = insert.nextInt();

    // Liberamos uso de memoria del objeto de entrada de datos
    insert.close();

    // Realizamos operatoria para el area del triangulo
    int resultado = (base * altura) / 2;

    // Imprimimos area del triangulo
    System.out.println("El area del triangulo es: " + resultado);

  }
}
