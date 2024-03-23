package Ejercicios.ProyetoRetos;

import java.util.Scanner;

public class _3_Ejercicio {

  public static boolean palindromo(String palabras) {
    for (int i = 0; i < palabras.length() / 2; i++) {
      if (palabras.charAt(i) != palabras.charAt(palabras.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner insert = new Scanner(System.in);
    // System.out.print("Ingrese una frase: ");
    String frase = insert.nextLine().toLowerCase().replaceAll("\\s", "");

    Boolean resultado = palindromo(frase);

    System.out.println(resultado);
    insert.close();
  }
}
