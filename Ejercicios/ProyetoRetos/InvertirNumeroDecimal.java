import java.util.Scanner;

public class InvertirNumeroDecimal {
  // ------------- Part 1 -----------------
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un numero decimal: ");
    float numero = scanner.nextFloat();

    float numeroInvertido = invertirDecimal(numero);

    System.out.println("Numero invertido: " + numeroInvertido);
  }
  // ------------- Part 2 -----------------
  public static float invertirDecimal(float numero) {
    int parteEntera = (int) numero;
    float parteDecimal = numero - parteEntera;

    int numeroInvertidoEntero = invertirEntero(parteEntera);
    float numeroInvertidoDecimal = invertirDecimalParteDecimal(parteDecimal);

    return numeroInvertidoEntero + numeroInvertidoDecimal;
  }
  // ------------- Part 3 -----------------
  public static int invertirEntero(int numero) {
    int numeroInvertido = 0;
    while (numero != 0) {
      numeroInvertido = numeroInvertido * 10 + numero % 10;
      numero /= 10;
    }
    return numeroInvertido;
  }
  // ------------- Part 4 -----------------
  public static float invertirDecimalParteDecimal(float numero) {
    float numeroInvertido = 0;
    float factor = 1;
    while (numero != 0) {
      factor /= 10;
      numeroInvertido += (numero % 10) * factor;
      numero *= 10;
      numero = (int) numero;
    }
    return numeroInvertido;
  }
}
