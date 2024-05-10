/**
 * Debe crear un programa que reciba por medio de entrada por teclado una 
 * palabra y la imprima antecedida por un Hello.
 * 
 * Imput : World (o cualquier otra palabra ingresada en consola)
 * Output: Hello "World" (u otra palabra)
*/
  
import java.util.Scanner;

public class _1_Ejercicio {
  public static void main(String[] args) {
    Scanner palabrota = new Scanner(System.in);

    String palabra;
    System.out.print("Ingresa una palabra: ");
    palabra = palabrota.nextLine();

    System.out.println("Hello " + palabra);
    palabrota.close();
  }
}
