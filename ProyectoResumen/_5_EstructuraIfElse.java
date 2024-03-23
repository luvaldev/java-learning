package ProyectoResumen;

import java.util.Scanner;

public class _5_EstructuraIfElse {
  public static void main(String[] args) {
    // ------------------------- If - Else -----------------------------
    /**
     * Estructura del if:
     * if(condicion){codigo}
     * 
     * Estructura del Else if:
     * else if(condicion){codigo}
     * 
     * Estructura del Else:
     * else{codigo}
     */

    /**
     * La ideologia de este condicional es seguir un patron en caso de utilizar
     * una cantidad > 1 de if, por ello la estructura a seguir seria:
     * 
     * if(caso1){codigo}
     * else if(caso2){codigo}
     * else if(caso n){codigo}
     * else{codigo}
     * 
     * En este caso, el codigo ira leyendo desde el primer caso hasta cuando
     * ya no se pueda cumplir con ningun caso, salta finalmente al else{codigo}
     * la idea de no utilizar solamente if es para que no haya problemas en
     * caso de que se llegaran a cumplir varios casos y se ejecuten muchas
     * acciones que tal vez no deberian ejecutarse al mismo momento.
     */

    // Ejemplo:

    /**
     * Cree un programa que lea 2 numeros los cuales se validen
     * que si a > b || a < b || a == b solamente con condicionales
     */

    //Declaramos la entrada de datos
    Scanner insert = new Scanner(System.in);
    //Preguntamos por el valor a
    System.out.print("Ingrese el numero a: ");
    int a = insert.nextInt();
    //Preguntamos por el valor b
    System.out.print("Ingrese el numero b: ");
    int b = insert.nextInt();
    //Liberamos la memoria del objeto
    insert.close();

    //Condicionales:
    if (a > b) {
      System.out.println("El numero a: " + a + " es mayor que b: " + b);
    }
    else if (a < b) {
      System.out.println("El nuermo a: " + a + " es menor que b: " + b);
    }
    else {
      System.out.println("El numero a: " + a + " es igual que b: " + b);
    }
  }
}
