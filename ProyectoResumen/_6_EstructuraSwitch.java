package ProyectoResumen;

import java.util.Scanner;

public class _6_EstructuraSwitch {
  public static void main(String[] args) {
    // ------------------------- Switch -----------------------------

    /**
     * El Switch es una forma similar a la de if else debido a que
     * su estructura en vez de hacer tanto codigo se utiliza
     * en base de casos, la estructura en general es:
     * 
     * switch (variable){
     *     case condicion1:
     *        codigo
     *        break;
     *     case condicionN:
     *        codigo
     *        break;
     *      default:
     *        codigo
     *        break;
     * }
     * 
     * El default funcionaria como el caso final "else", que es cuando
     * no se llega a cumplir ninguno de los case superiores.
     */

    //Ejemplo:

    /** 
     * Cree un programa para validar si un numero es par o impar
    */

    //Declaramos el objeto para la entrada de datos
    Scanner insert = new Scanner(System.in);
    //Preguntamos por el numero para validar
    System.out.print("Ingrese un numero para validar si es par o impar: ");
    int numero = insert.nextInt();
    //Liberamos la memoria del objeto
    insert.close();
    //Declaramos el switch para hacer la validacion
    switch (numero % 2) {
      case 0: //Si el sobrante es 0 es un numero par
        System.out.println("El numero " + numero + " es par.");
        break;
      default: //Para cualquier otro valor es impar
        System.out.println("El numero " + numero + " es impar");  
        break;
    }

  }
}
