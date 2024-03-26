package ProyectoResumen;

import java.util.Scanner;

public class _11_Funciones {
  // ------------------------------ Funciones ------------------------------
  /** 
   * Las funciones son bloques de codigo que realizan una tarea especifica y
   * pueden ser llamadas en cualquier parte del programa, las funciones pueden
   * o no recibir parametros y pueden o no retornar un valor, las funciones
   * que no retornan un valor se les conoce como metodos y las funciones que
   * retornan un valor se les conoce como funciones.
   * 
   * Para declarar una funcion se debe de seguir la siguiente estructura:
   * 
   * [tipo de acceso] [tipo de metodo] [tipo de dato] [nombre de la funcion] ([parametros]) {}
   * 
   * Los tipos de acceso son los mismos que en los metodos, los tipos de datos
   * pueden ser cualquier tipo de dato primitivo o de objeto, el nombre de la
   * funcion puede ser cualquier nombre valido y los parametros son opcionales.
   * 
   * Ejemplo:
   * 
   * public static int suma(int a, int b) {return a + b;}
   * 
   * public static void imprimir(String texto) {System.out.println(texto);}
   * 
   * public static boolean esPar(int num) {return num % 2 == 0;}
   * 
   * Aqui el tipo de acceso es public, el tipo de metodo es static, el tipo de
   * dato es int, String y boolean, el nombre de la funcion es suma, imprimir y
   * esPar y los parametros son a y b, texto y num.
  */

  // - Ejemplos:
  public static int suma(int a, int b) {
    return a + b;
  }
  
  // ------------------------------ Main ------------------------------
  public static void main(String[] args) {
    /** 
     * Para llamar a una funcion se debe de hacer de la siguiente manera:
    */

    Scanner insert = new Scanner(System.in);
    System.out.print("Ingresa dos numeros para sumarlos: ");
    int num1 = insert.nextInt();
    int num2 = insert.nextInt();
    insert.close();

    int resultado = suma(num1, num2);
    System.out.println("La suma de los numeros es: " + resultado);
    System.out.println(suma(num1, num2));

  }
}
