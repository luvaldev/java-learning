package ProyectoResumen;

import java.util.*;

public class _19_Stack {

  // ------------------- Pilas (Stack) ---------------------

  /**
   * Primero que todo hay que saber que los Stacks tienen un termino
   * LIFO el cual es "last in first out" en simples palabras el ultimo
   * en entrar sera el primero en salir.
   * 
   * Estructura de un Stack:
   * 
   * Stack<TipoDato> nombre = new Stack<TipoDato>();
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
   * push() - Agrega un objeto al principio del Stack
   * pop() - Retorna y elimina el ultimo elemento
   * peek() - Retorna el ultimo dato
   * empty() - Retorna si el Stack esta vacio
   * search(valor) - Retorna un numero positivo si lo encuentra caso contrario -1
   */

  public static void main(String[] args) {

    //Forma de declarar un Stack
    Stack<String> pila = new Stack<String>();

    //Agregar un dato
    pila.push("Que");
    pila.push("Si");

    //Recorrer el Stack
    while (!pila.isEmpty()) {
      System.out.println(pila.pop());
    }

  }

}
