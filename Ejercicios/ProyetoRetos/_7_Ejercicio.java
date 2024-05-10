import java.util.*;

public class _7_Ejercicio {
  public static void main(String[] args) {
    Scanner insert = new Scanner(System.in);

    System.out.println("Ingrese las operaciones y numeros que desea hacer, Ejemplo: ");
    System.out.println(" 3 3 + 2 2 + *");
    System.out.println(" (3 + 3)*(2 + 2)");
    System.out.print("Ingrese: ");
    String variable = insert.nextLine().toLowerCase().replaceAll("\\s", "");

    insert.close();

    Calculos(variable);

  }
  
  public static int Calculos(String x) {

    Stack<Integer> result = new Stack<>();

    for (int i = 0; i < x.length(); i++) {
      char y = x.charAt(i);

      if (Character.isDigit(y)) {
        char digit = (char) (y + '0');
        result.push(Character.getNumericValue(digit));
      }
      else{
        int v1 = result.pop();
        int v2 = result.pop();
        
        switch (y) {
          case '+':
            return v1 + v2;
            break;
          case '-':
            return v1 - v2;
            break;
          case '*':
            return v1 * v2;
            break;
          case '/':
            return v1 / v2;
            break;
          default:
            
            break;
        }
      }
    }
  }
}
