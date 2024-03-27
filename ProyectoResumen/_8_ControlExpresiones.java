package ProyectoResumen;

import java.util.*;

public class _8_ControlExpresiones {
  public static void main(String[] args) {
    // -------------------- Try catch finally -------------------------

    /**
     * La ideologia es asegurarnos de que el programa valide y prosiga
     * de forma autonoma el codigo en caso de no ser valido lo ingresado.
     * 
     * Estructura:
     * 
     * try{
     * - Aqui iria el codigo el cual puede ser una exepcion (Clases)
     * } catch (Aqui iria la exepcion){
     * - Dentro de aqui estaria el mensaje error del codigo
     * } finally{
     * - Aqui estaria la finalizacion y liberacion de memoria
     * }
     */

    // Ejemplo:
    Scanner insert = new Scanner(System.in);
    System.out.print("Ingresa un numero A: ");
    int a = insert.nextInt();
    System.out.print("Ingrese un numero B: ");
    int b = insert.nextInt();
    System.out.println("La division de A entre B es: " + (a / b));
    insert.close();
    /**
     * En este caso el objeto proveniente de la libreria Scanner
     * la funcion nextInt solamente recibe datos tipos int
     * en caso de ingresar una cadena de texto o un valor float
     * el programa tirara un error y lo cerrara sin seguir lo que
     * este por delante del codigo. Para ello, utilizaremos lo mencionado
     * de esta forma:
     */

    Scanner insertar = new Scanner(System.in);
    try {
      /**
       * La ideologia de este try es poner un objeto el cual nos provoque una
       * exepcion como es este caso que si ingresamos un caracter este va a tirar
       * un error y no ejecutara nada de lo siguiente del codigo.
       */
      System.out.print("Ingrese un numero A: ");
      int aDos = insertar.nextInt();
      System.out.print("Ingrese un numero B: ");
      int bDos = insertar.nextInt();
      System.out.println("La division de A entre B es: " + (aDos / bDos));

    } catch (InputMismatchException ex/* (Cualquier nombre) */) {
      /**
       * Primero mencionar que hay exepciones particulares como tal, si ejecutamos
       * el codigo en este caso tendremos un error "InputMismatchExcepcion" y ese
       * podremos controlarlo desde aqui, es importante mencionar que se pueden
       * agregar tantos catch como uno guste para validar otros casos
       */
      System.out.println("Ha ocurrido un error, ingrese un numero ENTERO.");

      /**
       * Tambien existen metodos que podemos usar, uno de ellos es el:
       * ex.getMessage()
       * Con este otorgarmos el mensaje error del cual lo podemos ingresar
       * en el sout para que aparezca por consola.
       */
    } catch (ArithmeticException ex/* (Cualquier nombre) */) {
      System.out.println("Ha ocurrido un error, has ingresado un CERO en el divisor.");
      /**
       * Este es otro caso, en el cual si ingresamos un 0 no es posible hacer
       * la division, por lo cual saldra otro error "ArithmeticExeption", por
       * lo cual lo controlaremos haciendo el mismo procedimiento.
       */
    }

    // ---- Caso generico ----
    /**
     * Supongamos que existe un caso no tan particular pero el cual pueda
     * hacer que nuestro programa tenga un problema, por ello utilizaremos
     * un metodo más "Padre" o general por decirlo asi:
     */
    catch (Exception ex/* (Cualquier nombre) */) {
      System.out.println("Ha ocurrido una exepcion general, " + ex.getMessage());
      ex.printStackTrace(System.out); // Este mensaje mostrara a detalle el error
    }
    // Ya con este metodo generico no es necesario para los casos particulares

    finally {
      /**
       * Ya por ultimo el finally es para cerrar y liberar uso de memoria en este
       * caso y finalizar continuar con el programa sin problemas de validacion.
       */
      insertar.close();
    }

    // ---------------------- Otro caso + limpio ---------------------------

    try (Scanner ingresarSc = new Scanner(System.in)) {
      System.out.print("Ingrese un numero entero: ");
      int num = ingresarSc.nextInt();

      System.out.print("Ingrese otro numero entero: ");
      int num2 = ingresarSc.nextInt();

      System.out.println("La division entre los numeros es: " + (num / num2));

    } catch (Exception ex) {
      System.out.println("Ha ocurrido un problema: " + ex.getMessage());
    }
    /**
     * En este caso hicimos algo similar que lo de arriba, el unico caso
     * a favor es que al momento de utilizar el try(Clase) el objeto
     * libera la propia memoria sin tener que utilizar el finally.
     * 
     * Importante mencionar que el try(Clase) solamente puede ser utilizada
     * en caso de tener agregado un "Closeable" dentro de su libreria, esto
     * puede ser visto apretando Ctrl + click izquierdo en el nombre de la class
     * en este caso "Scanner".
     */
  }
}