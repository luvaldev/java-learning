package ProyectoResumen;

// --------------------------- Interfaces ---------------------------
/**
 * Una interfaz es un tipo de referencia similar a una clase que
 * contiene solo constantes, firmas de métodos, métodos predeterminados
 * y métodos estáticos. No se pueden instanciar interfaces, pero se
 * pueden implementar. Una interfaz es un mecanismo que permite
 * definir un contrato que las clases deben seguir cuando implementan
 * la interfaz.
 * 
 * Estructura:
 * 
 * interface [NombreInterfaz] {
 * // Constantes
 * [Tipo de Acceso] [tipo dato] nombreConstante = valor;
 * }
 * 
 * interface [NombreInterfaz] {
 * // Métodos
 * [Tipo de Acceso] [tipo retorno] nombreMetodo(parametros);
 * }
 * 
 * class[NombreClase] implements [NombreInterfaz] {
 * // Cuerpo de la clase
 * }
 */

// Ejemplo:

interface Animal {
  public void sonidoAnimal();

  public int cantidadPatas = 4;

  public void sleep();
}
/**
 * Un dato, si declaramos una variable en una interfez esta se
 * convierte en una constante, por lo que no se puede modificar.
*/

class Perro implements Animal {
  public void sonidoAnimal() {
    System.out.println("El perro hace: Guau");
  }

  public void sleep() {
    System.out.println("El perro duerme");
  }
  public void cantidadPatas() {
    System.out.println("El perro tiene: " + cantidadPatas + " patas");
  }
}

public class _14_Interfaces {
  public static void main(String[] args) {
    Perro perro = new Perro();
    perro.sonidoAnimal();
    perro.sleep();
    perro.cantidadPatas();
  }
}