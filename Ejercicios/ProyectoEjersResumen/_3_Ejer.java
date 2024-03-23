/** 
 * Cree un programa en java que solicite 2 numeros para una division
 * comprobar si el divisor es 0, si es asi, manda un mensaje
 * para indicar que no es posible dividir entre 0.
*/

package Ejercicios.ProyectoEjersResumen;

import java.util.Scanner; //Importante agregar libreria

public class _3_Ejer {
  // Generamos metodo main
  public static void main(String[] args) {
    // Creamos objeto para la entra de datos
    Scanner insert = new Scanner(System.in);

    // Solicitar numero 1
    System.out.print("Ingrese el primer numero: ");
    int numUno = insert.nextInt();

    // Solicitar numero 2
    System.out.print("Ingrese el segundo numero: ");
    int numDos = insert.nextInt();

    insert.close();

    // Creamos los dos casos posibles (El integer.toString es un conversor de
    // numeros a texto)
    String mensaje = (numDos > 0) ? Integer.toString(numUno / numDos) : "El divisor es 0";

    // Imprimimos el resultado
    System.out.println(mensaje);

  }
}
