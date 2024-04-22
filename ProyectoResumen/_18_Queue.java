package ProyectoResumen;

import java.util.*;

public class _18_Queue {
  // ---------------- Colas (Queue) --------------------

  /**
   * Primero que todo un Queue o una cola es conocida como un tipo
   * de dato de Lista la cual funciona como FIFO (First in First out)
   * el primer dato que entre sera el primero en salir.
   * 
   * Su estructura es:
   * 
   * Queue<TipoDato> nombre = new LinkedList<tipoDato>();
   * 
   * Importante mencionar que el tipo de dato solamente son clases
   * por ello:
   * 
   * int = Integer
   * double = Double
   * String
   * Class
   * 
   * Esos tipos de datos pueden ser utilizados.
   * 
   * Metodos más utilizados:
   * 
   * peek() - Retorna el valor pero no lo elimina
   * add() - Agrega un objeto al final
   * poll() - Retorna el valor pero lo elimina
   * isEmpty() - Retorna que si la cola esta vacia
   * 
   */

  public static void main(String[] args) {
    //Forma de declarar un Queue
    Queue<String> colas = new LinkedList<String>();

    //Agregar datos
    colas.add("Hola");
    colas.add("Chao");
    colas.add("Hasta luego");

    //Solamente imprime el primero
    System.out.println(colas.peek());

    //En cambio el poll elimina y retorna el primero
    System.out.println(colas.poll());

    //Forma de recorrer la cola
    while (!colas.isEmpty()) {
      System.out.println(colas.poll());
    }

  }
}
