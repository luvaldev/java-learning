package ProyectoResumen;

public class _13_Herencia {
  //------------------- Herencia -----------------------------
  /** 
   * La herencia es una de las caracteristicas mas importantes de la POO
   * ya que nos permite crear una clase a partir de otra clase ya existente
   * 
   * La estructura es:
   * 
   * [tipo de acceso] class nombre extends nombreClase{
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
   * 
   * En la herencia se pueden usar los metodos y atributos de la clase padre
   * y se pueden sobreescribir los metodos de la clase padre.
   * 
   * La herencia se puede dar de la siguiente manera:
   * 
   * [tipo de acceso] class nombre extends nombreClase{
   * 
   *    // Atributos:
   *    [tipo de acceso] [tipo de dato] nombre;
   * 
   *    // Constructor:
   *    [tipo de acceso] nombre([tipo de dato] nombre){
   *        super(nombre);
   *        // El super. solamente se usa si el parametro que recibe
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

  //Clase padre:
  public static class Calculadora {
    // Atributos:
    protected int num1;
    protected int num2;

    // Constructor:
    public Calculadora(int num1, int num2) {
      this.num1 = num1;
      this.num2 = num2;
    }

    // Metodos:
    public int sumar() {
      return num1 + num2;
    }
    public int restar() {
      return num1 - num2;
    }

    // Getter:
    public int getNum1() {
      return num1;
    }

    public int getNum2() {
      return num2;
    }

    // Setter:
    public void setNum1(int num1) {
      this.num1 = num1;
    }
    public void setNum2(int num2) {
      this.num2 = num2;
    }
  }

  //Clase hija:
  public static class CalculadoraAvanzada extends Calculadora {
    // Atributos:
    protected int num3;

    // Constructor:
    public CalculadoraAvanzada(int num1, int num2, int num3) {
      super(num1, num2); // Se llama al constructor de la clase padre
      this.num3 = num3;
    }

    // Metodos:
    public int multiplicar() {
      return num1 * num2 * num3;
    }

    public int dividir() {
      return num1 / num2 / num3;
    }

    // Getter:
    public int getNum3() {
      return num3;
    }

    // Setter:
    public void setNum3(int num3) {
      this.num3 = num3;
    }
  }

  public static void main(String[] args) {
    // Se crea un objeto de la clase hija
    CalculadoraAvanzada calculadora = new CalculadoraAvanzada(10, 5, 2);

    // Se llama a los metodos de la clase padre
    System.out.println("Suma: " + calculadora.sumar());
    System.out.println("Resta: " + calculadora.restar());
    System.out.println("Numero 1: " + calculadora.getNum1());
    System.out.println("Numero 2: " + calculadora.getNum2());
    System.out.println("Numero 3: " + calculadora.getNum3());

    // Se llama a los metodos de la clase hija
    System.out.println("Division: " + calculadora.dividir());
    System.out.println("Multiplicacion: " + calculadora.multiplicar());
  }
}
