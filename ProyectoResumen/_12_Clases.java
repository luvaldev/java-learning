package ProyectoResumen;

public class _12_Clases {
  //------------------- Clases -----------------------------
  /** 
   * Una "Class" es un tipo de plantilla para crear objetos, en
   * los cuales tiene atributos y comportamientos como funciones
   * o metodologias que se pueden implementar dentro de la class
   * 
   * La estructura es:
   * 
   * [tipo de acceso] class nombre{
   * 
   *    // Atributos:
   *    [tipo de acceso] [tipo de dato] nombre;
   * 
   *    // Constructor:
   *    [tipo de acceso] nombre([tipo de dato] nombre){
   *        this.nombre = nombre;
   *        // El this. solamente se usa si el parametro que recibe
   *        // el constructor tiene el mismo nombre del atributo.
   *    }
   * 
   *    // Metodos:
   *    [tipo de acceso] [tipo de metodo] nombre(){
   *        //Codigo del metodo
   *        //Dependiendo del metodo se retorna o no
   *    }
   * }
  */

  //Ejemplo:
  public static class Operatorias{
    //Atributos
    private int numeroUno;
    private int numeroDos;

    //Constructor
    public Operatorias(int numeroUno, int numeroDos){
      this.numeroUno = numeroUno;
      this.numeroDos = numeroDos;
    }

    //Metodos
    public int suma(){
      return numeroUno + numeroDos;
    }
    public int resta(){
      return numeroUno - numeroDos;
    }
    public int multiplicacion(){
      return numeroUno * numeroDos;
    }
    public float division(){
      return numeroUno / numeroDos;
    }

    //Metodo imprimir
    public void imprimir(){
      System.out.println("Tus numeros ingresados son: " + numeroUno + " ; " + numeroDos);
      System.out.println("Suma: " + (numeroDos + numeroUno));
      System.out.println("Resta: " + (numeroUno - numeroDos));
      System.out.println("Multiplicacion: " + (numeroUno * numeroDos));
      if(numeroUno == 0 && numeroDos == 0){
        System.out.println("La division no es posible.");
      }
      else if(numeroUno == 0){
        System.out.println("Division: " + (numeroUno / numeroDos));
      }
      else{
        System.out.println("Division: " + (numeroDos / numeroUno));
      }
    }
  }


  public static void main(String[] args){
    //Metodos para crear un objeto de la clase Operatorias
    Operatorias operacion = new Operatorias(1, 3);

    //Otra forma de crear un objeto de la clase Operatorias:
    int numeroUno = 11;
    int numeroDos = 6;

    Operatorias operacion2 = new Operatorias(numeroUno, numeroDos);

    //Forma de llamar a los metodos de la clase Operatorias
    System.out.println("Suma: " + operacion.suma());
    System.out.println("Resta: " + operacion.resta());
    System.out.println("Multiplicacion: " + operacion.multiplicacion());
    System.out.println("Division: " + operacion.division());
    operacion.imprimir();

    //Llamando a los metodos de la segunda operacion
    System.out.println("Suma: " + operacion2.suma());
    System.out.println("Resta: " + operacion2.resta());
    System.out.println("Multiplicacion: " + operacion2.multiplicacion());
    System.out.println("Division: " + operacion2.division());
    operacion2.imprimir();
  }
}
