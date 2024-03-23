package ProyectoResumen;

import java.util.Scanner;
//Necesario importar el paquete y la clase que utilizaremos Scanner

public class _4_Scanner {
  public static void main(String[] args) {
    // --------------------- Scanner (Ingresar datos) -----------------------
    Scanner entradaDatos = new Scanner(System.in);
    /**
     * Lo que creamos en pequeñas instancias es un nuevo objeto
     * con el argumento de entrada a datos, a diferencia de cuando
     * imprimimos cualquier tipo de dato es System.out que seria
     * la salida de lo que ingresamos.
     */

    // Un ejemplo:
    System.out.print("Ingresa tu nombre: "); // Sin el ln no hace salto linea
    String nombre = entradaDatos.nextLine();
    /**
     * La metodologia es utilizar el objeto que creamos para ingresar datos
     * mediante el .next, considerar el tipo de dato que utilizaremos
     * para el ingresarlos, .nextInt .nextLine .nextDouble , etc.
     */
    System.out.print("Ingresa tu edad: ");
    int edad = entradaDatos.nextInt();

    // Imprimiremos la informacion
    System.out.println("\n---- Informacion Personal ----");
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);

    // Algo muy IMPORTANTE es liberar la memoria de los objetos que utilizamos
    // Por ello liberamos el uso de memoria del objeto de la siguiente forma
    entradaDatos.close();
  }
}
