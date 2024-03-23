package ProyectoResumen;

public class _7_Ciclos {
  public static void main(String[] args) {
    // ------------------------- Ciclos -----------------------------

    /**
     * Existen varios tipos de ciclos, For, While, Do While
     * Estrucutra del ciclo tipo for:
     * 
     * for(inicializacion; condicion; incremendo || decremento){codigo}
     * 
     * Estructura del ciclo tipo While:
     * 
     * while(condicion){codigo}
     * 
     * Estructura del ciclo tipo Do While:
     * 
     * Do{codigo}While{condicion};
     */

    // Un ejemplo de tipo For
    for (int i = 0; i < 20; i++) {
      System.out.println((int) (Math.random() * 10));
      /**
       * Hay que tener en cuenta que esto generara numeros desde
       * 0.1 hasta 1.0, al momento de multiplicarlo por 10, generara
       * numeros aleatorios desde el 0 hasta el 9, debido a que la
       * multiplicacion que usemos va a generar siempre uno menor
       * al numero que utilizamos para multiplicar.
       */

      // Si quisieramos un rango por ejemplo
      System.out.println((int) (Math.random() * 20 + 30));
      /**
       * Esto funcionaria como un rango, desde 30 hasta 49.
       * Esto se debe a que el 30 es nuestro punto de partida
       * y la suma como es 50 siempre es un numero menor.
       * 
       * Una forma de entenderlo es que el numero inicial(20)
       * es nuestro rango final - 1 y el numero sumando es el punto
       * de partida (30), consecuencia seria [49, 30].
       * 
       * a = 20, b = 30 ; b es inicio, rango entre b hasta (b + (a - 1))
       */
    }

    // Un ejemplo para el while
    int a = 1;
    while (a != 30) {
      System.out.println("Hola mundo");
      a++;
    }
    /**
     * Mientras que se cumpla la condicion el while ejecutara
     * el codigo dentro.
     */

    // Un ejemplo para el do while
    int b = 2;
    do {
      System.out.println("Hola mundo");
      b++;
    } while (b <= 5);
    /**
     * Lo que haremos en este caso es que el do while, siempre
     * pero siempre ejecuta una vez el codigo que hay dentro,
     * luego lee la condicion y si se cumple sigue ejecutandolo
     * hasta que deje de cumplirse.
     */

  }
}
