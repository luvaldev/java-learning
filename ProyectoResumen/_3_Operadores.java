package ProyectoResumen;

public class _3_Operadores {
  public static void main(String[] args) {
    // --------------------- Operadores Aritmeticos ---------------------
    /**
     * Suma (+)
     * Resta (-)
     * Multiplicacion (*)
     * Division (/)
     * Modulo (%) Tambien conocido como lo sobrante de la division
     */

    // ------------------- Operadores de Asignacion ----------------------
    /**
     * (=) Asignar un valor a una variable
     * (+=) Asignar una suma a una variable
     * (-=) Asignar una resta a una variable
     * (*=) Asignar una multiplicacion a una variable
     * (++) Incremento
     * (--) Decremento
     */

    // ------------------- Operadores Relacionales -----------------------
    /**
     * (==) Igual que
     * (!=) Distinto de
     * (>) Mayor que
     * (<) Menor que
     * (>=) Mayor o igual que
     * (<=) Menor o igual que
     */
    // -------------------- Operadores Logicos ---------------------------
    /**
     * (||) or
     * (&&) and
     * (!) Not
     * 
     * Operador ternario:
     * (? expresion1 : expresion2)
     */

    // Ejemplos de operadores logicos:
    int valor = 19;
    String resultado = (valor > 18) ? "Eres mayor de edad" : "Eres menor de edad";
    // Variable String = condicion ? True : Flase; retorna en base a la condicion.
    System.out.println(resultado);

    // -------------------- Metodos de Math ------------------------------
    int numUno = 10;
    int numDos = 20;
    int resultadov2 = numDos + numUno;
    System.out.println(resultadov2);
    // Aplicando metodologias de la libreria Math
    System.out.println(Math.sqrt(resultadov2));
    System.out.println(Math.E); // Valor de Euler
    System.out.println(Math.PI); // Valor de PI
    // Math es una libreria con diferentes tipos de operadores adicionales
    // Si damos Ctrl + click izquierdo podemos acceder a todo lo que implementa

    // - Operadores conocidos de la libreria Math
    /**
     * sqrt(valor || variable) - Raiz cuadrada
     * cbrt(valor || variable) - Raiz cubica
     * log10(valor || variable) - Logaritmo base 10
     * pow(valor || variable, valorPotencia) - Potencias
     * round(valor || variable) - Redondear al valor más cercano
     * random() - Genera numeros aleatorios desde 0.1 hasta 1.0
     */

    // ------------------- Casting (Conversion de datos) ----------------------
    int num = 29;

    // Raiz normal que retornara un valor tipo double
    double raiz = Math.sqrt(num);
    System.out.println(raiz);
    // Raiz con una conversion de dato a tipo int
    /**
     * Algo importante de entender es que el tipo de dato cambia
     * solamente que la operacion de la raiz la retornara a un tipo
     * de dato int y no float.
     */
    int raizv2 = (int) (Math.sqrt(num));
    System.out.println(raizv2);

    // Otro ejemplo es para transformar un int a un string
    int numv2 = 30;
    String numeroTexto = Integer.toString(numv2);
    System.out.println(numeroTexto);
    /**
     * El Integer es otra libreria al igual que el Math con propiedades
     * que pueden ser utiles en varios aspectos.
     */

    // Ahora el caso contrario, String a int
    String nombre = "Luis";
    int nombreNumero = Integer.parseInt(nombre);
    System.out.println(nombreNumero);
  }
}
