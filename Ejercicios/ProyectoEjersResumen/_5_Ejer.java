/** 
 * La empresa necesita un sistema para calcular el salario total
 * anual de un empleado para fin de año, considerando diferentes
 * niveles de aguinaldo basados en los años de servicio. El
 * sueldo base anual es de $8400.
 *	
 * - Se pide al usuario que ingrese el numero de años trabajados,
 * y segun el rango de años ingresado, calcular el aguinaldo que
 * le corresponde, mostrando asi el salario total anual junto
 * con el aguinaldo que le toca, en la salida estandar (consola).
 *
 * - Los niveles de aguinaldo son del 10%, 20% y 30% del sueldo
 * base anual para los rangos de 1-4 años (10%), 5-10 (20%)
 * y más de 10 años (30) respectivamente. Los estudiantes deben
 * comprender la logica condicional y el calculo de agunaldo en
 * funcion de los años trabajados.
*/

package Ejercicios.ProyectoEjersResumen;

import java.util.Scanner;

public class _5_Ejer {
  //Generamos metodo main
  public static void main(String[] args) {
    //Ingresamos datos necesarios
    int sueldoBase = 8400;
    int anhosTrabajados;
    String nombre;

    //Creamos objeto para ingreso de datos
    Scanner insert = new Scanner(System.in);

    //Solicitamos nombre y años de trabajo
    System.out.print("Ingrese su nombre de usuario: ");
    nombre = insert.nextLine();
    System.out.print("Ingrese la cantidad de años de trabajo: ");
    anhosTrabajados = insert.nextInt();

    //Liberamos memoria utilizada en el objeto
    insert.close();

    //Imprimimos datos solicitados
    System.out.println(" ----------------------------------------------- ");
    System.out.println(" - Datos del usuario - ");
    //Condiciones
    if (anhosTrabajados >= 1 && anhosTrabajados <= 4) {
      System.out.println("Nombre: " + nombre);
      System.out.println("Salario anual + aguinaldo: " + (sueldoBase * 1.1));
    } else if (anhosTrabajados > 4 && anhosTrabajados <= 10) {
      System.out.println("Nombre: " + nombre);
      System.out.println("Salario anual + aguinaldo: " + (sueldoBase * 1.2));
    } else {
      System.out.println("Nombre: " + nombre);
      System.out.println("Salario anual + aguinaldo: " + (sueldoBase * 1.3));
    }
  }
}
