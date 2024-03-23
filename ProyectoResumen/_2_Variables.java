package ProyectoResumen;

public class _2_Variables {
  // Generar metodo main
  public static void main(String[] args) {
    // ------------------- Variables primitivas ---------------------------
    int numero = 10;
    double decimal = 11.2;
    char letra = 'a';
    boolean esMayor = true;

    // ------------------- Imprimir variables ------------------------------
    /* sysout */
    System.out.println(numero);
    System.out.println(decimal);
    System.out.println(letra);
    System.out.println(esMayor);

    // --- Variables referenciadas y tipos de datos referenciables Clases ---
    String nombre = "Pedrito";

    /**
     * En estos casos la variables de tipo String son objetos y esto es facil
     * debido a que si utilizamos nombre. nos mostrara todos los metodos
     * y realmente la forma de definir un string es la siguiente
     */
    String nombre2 = new String("Juan");
    /**
     * De todas formas esta forma al ser un tipo de string esta optimizado para
     * utilizarlo de forma directa por lo cual se utiliza de la primera forma
     */
    System.out.println(nombre);
    System.out.println(nombre2);

    // ---------------- Metodo de concatenacion (para unir) -------------------

    System.out.println(nombre + " " + nombre2);
    /**
     * En caso de ser dos variables de tipo int por ejemplo, los sumara.
     * Tambien podemos hacer saltos de linea con \n
     */
    System.out.println(nombre + "\n" + nombre2);
  }
}
