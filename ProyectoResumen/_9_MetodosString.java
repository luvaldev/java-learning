package ProyectoResumen;

public class _9_MetodosString {
  public static void main(String[] args) {
    // ------------------------- Libreria String --------------------------------

    /**
     * Metodos para obtener la informacion sobre la cadena:
     * 
     * length() - Retornara el tamaño de la cadena de texto
     * charAt(int x) - Retornara letra o caracter dentro de la posicion mencionada
     * indexOf(String x) - Retornara la posicion de la primera letra o caracter.
     * subString(int x, int y) - Retornara una subcadena de la cadena original
     * 
     * Metodos de comparacion:
     * 
     * equals(String x) - Compara si dos cadenas son iguales
     * equalsIgnoreCase(String x) - Compara si dos cadenas son iguales sin importar
     * mayusculas o minusculas
     * 
     * Metodos de manipulacion:
     * 
     * concat(String x) - Concatena dos cadenas
     * toLowerCase() - Convierte la cadena a minusculas
     * toUpperCase() - Convierte la cadena a mayusculas
     * trim() - Elimina los espacios en blanco al inicio y al final de la cadena
     * 
     * Metodos de verificacion y comprobacion:
     * 
     * startsWith(String x) - Verifica si la cadena comienza con la letra o palabra
     * endsWith(String x) - Verifica si la cadena termina con la letra o palabra
     * contains(String x) - Verifica si la cadena contiene la letra o palabra
     * isempty() - Verifica si la cadena esta vacia
     * isblank() - Verifica si la cadena esta en blanco
     * matches(String x) - Verifica si la cadena coincide con la expresion regular
     * 
     * Metodos de manipulacion con expresiones regulares:
     * 
     * replace(String x, String y) - Reemplaza la primera cadena con la segunda
     * replace(char x, char y) - Reemplaza el primer caracter con el segundo
     * replaceAll(String x, String y) - Reemplaza todas las coincidencias de la
     * replaceFirst(String x, String y) - Reemplaza la primera coincidencia de la
     * cadena
     * split(String x) - Divide la cadena en subcadenas
     * 
     * Informacion extra:
     * \t - Tabulacion
     * \n - Salto de linea
     * \\s - Espacio en blanco
     * 
     * \\S - No espacio en blanco
     * \\d - Digito
     * \\D - No digito
     */

    // - Ejemplos:
    String texto = "Hola mucho gusto";

    // ---------- Metodos para obtener la informacion sobre la cadena ----------

    // length()
    System.out.println("length() : " + texto.length());

    // charAt(int x)
    System.out.println("charAt(int x): " + texto.charAt(0));

    // indexOf(String x)
    System.out.println("indexOf(String x): " + texto.indexOf("m"));

    // subString(int x, int y)
    System.out.println("subString(int x, int y): " + texto.substring(5, 10));

    // ---------- Metodos de comparacion ----------

    // equals(String x)
    System.out.println("equals(String x): " + texto.equals("Hola mucho gusto"));

    // equalsIgnoreCase(String x)
    System.out.println("equalsIgnoreCase(String x): " + texto.equalsIgnoreCase("hola mucho gusto"));

    // ---------- Metodos de manipulacion ----------

    // concat(String x)
    System.out.println("concat(String x): " + texto.concat(" como estas"));

    // toLowerCase()
    System.out.println("toLowerCase(): " + texto.toLowerCase());

    // toUpperCase()
    System.out.println("toUpperCase(): " + texto.toUpperCase());

    // trim()
    System.out.println("trim(): " + texto.trim());

    // ---------- Metodos de verificacion y comprobacion ----------

    // startsWith(String x)
    System.out.println("startsWith(String x): " + texto.startsWith("Hola"));

    // endsWith(String x)
    System.out.println("endsWith(String x): " + texto.endsWith("gusto"));

    // contains(String x)
    System.out.println("contains(String x): " + texto.contains("mucho"));

    // isempty()
    System.out.println("isempty(): " + texto.isEmpty() + "   " /* <-Esto si lo cuenta */);

    // isblank()
    System.out.println("isblank(): " + texto.isBlank());

    // matches(String x)
    System.out.println("matches(String x): " + texto.matches("Hola mucho gusto"));

    // ---------- Metodos de manipulacion con expresiones regulares ----------

    // replace(String x, String y)
    System.out.println("replace(String x, String y): " + texto.replace("Hola", "Adios"));

    // replace(char x, char y)
    System.out.println("replace(char x, char y): " + texto.replace('o', 'a'));

    // replaceAll(String x, String y)
    System.out.println("replaceAll(String x, String y): " + texto.replaceAll("Hola", "Adios"));
    System.out.println("replaceAll(String x, String y): " + texto.replaceAll("[Hmg]", "X"));

    // replaceFirst(String x, String y)
    System.out.println("replaceFirst(String x, String y): " + texto.replaceFirst("Hola", "Adios"));

    // split(String x)

  }
}
