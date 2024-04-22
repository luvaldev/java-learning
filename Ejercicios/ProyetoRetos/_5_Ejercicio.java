/** 
 * Cree un programa que reciba por consola un numero N, diseñe su algoritmo
 * que invierta sus digitos.
 * 
 * Ejemplo:
 * 
 * Input N = 2674
 * Output = 4762
*/

import java.util.Scanner;

public class _5_Ejercicio {
  //Generamos metodo main
  public static void main(String[] args) {
    //Generamos objeto para insertar datos
    Scanner insert = new Scanner(System.in);

    //Preguntamos por el numero y se insterta por consola
    System.out.print("Ingrese un numero entero: ");
    int n = insert.nextInt();

    //Cerramos objeto para liberar memoria utilizada
    insert.close();

    //Imprimimos y llamamos a la funcion girar
    System.out.println("El numero al revez es: " + (girar(n)));

  }

  //Funcion tipo int llamada girar
  public static int girar(int x) {
    //Utilizamos un auxiliar
    int numeroGirado = 0;
    //Realizamos un recorrido del parametro recibido hasta que llegue a 0
    while (x != 0) {
      //Almacenamos el ultimo digito 
      int digito = x % 10;
      //Ampliamos por 10 y agregamos el digito
      numeroGirado = numeroGirado * 10 + digito;
      //Con esto el parametro recibido le quitaremos el ultimo valor
      x /= 10;
    }
    //Retornamos el numero girado
    return numeroGirado;
  }
  
}

