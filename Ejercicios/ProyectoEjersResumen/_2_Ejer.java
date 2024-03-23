/** 
 * Cree un programa en java el cual solicite por teclado
 * un nombre y una edad por consola y luego imprimalo.
*/

package Ejercicios.ProyectoEjersResumen;

import java.util.Scanner; //Importante declarar libreria

public class _2_Ejer {
  // Generamos metodo main
  public static void main(String[] args) {
    // Declaramos la entrada de datos
    Scanner insert = new Scanner(System.in);

    // Solicitamos el nombre del usuario
    System.out.print("Ingrese su nombre de usuario: ");
    String nombre = insert.nextLine();

    // Solicitamos la edad
    System.out.print("Ingrese su edad: ");
    int edad = insert.nextInt();

    // Cerramos el objeto con la entrada de datos al no utilizarlo más 
    insert.close(); //Con la finalidad de liberar memoria utilizada

    // Imprimimos el nombre y la edad
    System.out.println(" ---- Datos ---- " + "\n" + "Su nombre es: " + nombre + "\n" + "Su edad es: " + edad);
  }
}
