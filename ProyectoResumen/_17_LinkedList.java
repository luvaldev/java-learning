package ProyectoResumen;

import java.util.*;

public class _17_LinkedList {
  //---------------- LinkedList -----------------------

  /** 
   * 
   * LinkedList es una clase que implementa la interfaz List.
   * LinkedList es una lista doblemente enlazada.
   * 
   * La forma de declarar este tipo de lista es de la siguiente forma:
   * 
   * List<TipoDato> nombre = new LinkedList<tipoDato>();
   * 
   * Es importante mencionar que los tipos de datos que pueden ser
   * ingresados a esta Lista son de tipo clase por ello:
   * 
   * int = Integer
   * double = Double
   * String
   * Class
   * 
   * Ese es el tipo de dato permitido en estos tipos de listas. 
   * 
   * Metodos mas comunes:
   * 
   * add(): Agrega un elemento al final de la lista.
   * get(i): Devuelve un elemento de la lista por su indice.
   * size(): Devuelve el numero de elementos de la lista.
   * remove(i): Elimina un elemento de la lista por su indice.
   * clear(): Elimina todos los elementos de la lista.
   * 
  */

  public static void main(String[] args) {
    //Forma de declarar una LinkedList
    List<Animal> list = new LinkedList<Animal>();
    /** 
     * List<TipoDato> nombre = new LinkedList<TipoDato>();
    */

    //Agregar un objeto a la lista
    list.add(new Animal("Perro", 5));
    list.add(new Animal("Gato", 6));

    //Acceder a un metodo
    list.get(0).informacion();

    //Recorrer con Foreach
    for (Animal ani : list) {
      System.out.println("Prueba: " + ani.getNombre());
    }

    //Agregar un dato al principio
    ListIterator<Animal> it = list.listIterator();
    it.next();
    it.add(new Animal("Pato", 10));

  }

  public static class Animal {
    private int numero;
    private String nombre;

    public Animal(String nombre, int numero) {
      this.numero = numero;
      this.nombre = nombre;
    }

    public int getNumero() {
      return numero;
    }

    public String getNombre() {
      return nombre;
    }

    public void informacion() {
      System.out.println(" ----------- Informacion -----------");
      System.out.println("Numero: " + numero);
      System.out.println("Nombre: " + nombre);
    }
  }
}
