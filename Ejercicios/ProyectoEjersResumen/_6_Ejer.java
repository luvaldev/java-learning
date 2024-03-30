/** 
 * Desarrolla un sistema tipo recompensas de niveles para un
 * videojuego donde existen 3 razas principales; Magos,
 * Arqueros y Guerreros:
 *
 * Pedir al usuario que seleccione la raza del personaje con
 * ayuda de un menú con titulo: [MAZMORRA DE RECOMPENSAS],
 * justo con 4 opciones, las 3 primeras serán las razas y la
 * ultima será una opción para salir.
 *
 * Pedir al usuario el nivel del personaje, con esta información
 * desarrollar la lógica para que muestre al usuario por consola
 * un mensaje de la raza del personaje seleccionado + el nivel
 * ingresado.
 *
 * Las recompensas se reparten depende el rango del nivel:
 *  Si el personaje tiene un nivel entre 1-50	
 * - Obtiene 1000 de oro.
 *  Si el personaje tiene un nivel entre 51-99
 * - Obtiene 50 de diamante.
 *  Si el personaje tiene un nivel 100 o más
 * [Magos] - Obtiene un Baculo Sagdrado + 100 diamantes.
 * [Arqueros] - Obtiene Arco divino + 100 diamantes.
 * [Guerreros] - Obtiene Espada Durendal + 100 diamantes.
*/

package Ejercicios.ProyectoEjersResumen;

import java.util.Scanner;

public class _6_Ejer {
  public static void main(String[] args) {
    // Creamos objeto para ingreso de datos
    Scanner insert = new Scanner(System.in);

    while (true) {
      // Declaramos variables
      int op;
      int nivel;

      // Generamos menu para ingresar tipo de raza
      System.out.println(" - MAZMORRA DE RECOMPENSAS - ");
      System.out.println("1. Magos");
      System.out.println("2. Arqueros");
      System.out.println("3. Guerreros");
      System.out.println("4. Salir");
      //Validacion para ingresar numero entre el rango
      do {
        System.out.print("Ingrese una raza: ");
        op = insert.nextInt();
      } while (op < 1 || op > 4);
      
      // Condicion Salida
      if (op == 4) {
        System.out.println("Usted salio del juego.");
        break;
      }
      // Preguntamos por el nivel
      System.out.print("Ingrese el nivel de jugador: ");
      nivel = insert.nextInt();

      //Condiciones generales 
      if (nivel >= 1 && nivel <= 50) {
        if (op == 1) {
          System.out.println("Tipo de raza: Mago ; Obtiene 1000 de oro.");
        } else if (op == 2) {
          System.out.println("Tipo de raza: Arquero ; Obtiene 1000 de oro.");
        } else {
          System.out.println("Tipo de raza: Guerrero ; Obtiene 1000 de oro.");
        }
      } else if (nivel > 50 && nivel < 100) {
        if (op == 1) {
          System.out.println("Tipo de raza: Mago ; Obtiene 50 diamantes.");
        } else if (op == 2) {
          System.out.println("Tipo de raza: Arquero ; Obtiene 50 diamantes.");
        } else {
          System.out.println("Tipo de raza: Guerrero ; Obtiene 50 diamantes.");
        }
      } else {
        if (op == 1) {
          System.out.println("Tipo de raza: Mago ; Obtiene Baculo Sagdrado + 100 diamantes.");
        } else if (op == 2) {
          System.out.println("Tipo de raza: Arquero; Obtiene Arco divino + 100 diamantes.");
        } else {
          System.out.println("Tipo de raza: Guerrero ; Obtiene Espada Durendal + 100 diamantes.");
        }
      }

      System.out.println(" "); //Salto de linea
    }

    // Liberamos memoria del objeto
    insert.close();
  }
}
