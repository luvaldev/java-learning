package ProyectoResumen;

import java.util.*;

public class _16_ArrayList {
  public static void main(String[] args) {
    // ------------------- ArrayList -------------------

    /**
     * ArrayList: Es una coleccion de elementos que se almacenan en un array
     * dinamico. Permite almacenar elementos de cualquier tipo y se puede acceder 
     * a los elementos por su indice.
     * 
     * La forma de declararlo es la siguiente:
     * 
     * List<tipoDato> nombre = new ArrayList<TipoDato>();
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
     * 
     * Metodos mas comunes:
     * 
     * add(): Agrega un elemento al final de la lista.
     * get(i): Devuelve un elemento de la lista por su indice.
     * size(): Devuelve el numero de elementos de la lista.
     * remove(i): Elimina un elemento de la lista por su indice.
     * clear(): Elimina todos los elementos de la lista.
     */

    //Ejemplo acompañado de la class

    List<Animal> lista = new ArrayList<Animal>();

    /**
     * List<TipoDato> nombre = new ArrayList<TipoDato>();
    */
    
    //Creamos un objeto a la lista
    lista.add(new Animal(10, "Perro"));

    //Forma de imprimir
    System.out.println("Ejemplo: " + lista.get(0).getNumero());
    
    //Forma de acceder a los metodos
    lista.get(0).parametros();

    //Recorrido for normal
    System.out.println(" ------- Recorrido for Normal -------");
    for (int i = 0; i < lista.size(); i++) {
      System.out.println("Recorrido " + (i + 1) + ": " + lista.get(i).getNumero());
    }

    //Recorrido foreach
    System.out.println(" ------- Recorrido foreach --------");
    for (Animal ani : lista) {
      System.out.println("Recorrido: " + ani.getNumero());
    }
  }
  
  //Ejemplo:

  public static class Animal {
    private int num;
    private String nombre;

    public Animal() {
    }

    public Animal(int num, String nombre) {
      this.num = num;
      this.nombre = nombre;
    }

    public int getNumero(){
      return num;
    }

    public void parametros() {
      System.out.println(" ------------ Informacion -------------");
      System.out.println("El nombre es: " + nombre);
      System.out.println("El numero es: " + num);
    }
  }
}
