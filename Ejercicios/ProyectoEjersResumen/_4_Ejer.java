/** 
 * Cree un programa en Java que solicite un numero por consola
 * en el cual verifica si aquel numero es par o impar.
*/

package Ejercicios.ProyectoEjersResumen;

import java.util.Scanner; //Importante para el uso del Scanner

public class _4_Ejer {
  // Creamos metodo main
  public static void main(String[] args) {
    // Declaramos objeto para insertar datos
    Scanner insert = new Scanner(System.in);

    // Solicitamos numero para realizar lo solicitado
    System.out.print("Ingrese un numero para validar si es par: ");
    int numero = insert.nextInt();

    // Liberamos la memoria utilizada por el objeto
    insert.close();

    // Validamos si el numero es par o no
    if (numero % 2 == 0) {
      System.out.println("El numero " + numero + " es par.");
    } else {
      System.out.println("El numero " + numero + " no es par.");
    }
  }
}
