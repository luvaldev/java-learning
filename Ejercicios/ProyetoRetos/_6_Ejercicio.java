import java.util.*;

public class _6_Ejercicio {

  public static void main(String[] args) {
    Scanner insert = new Scanner(System.in);

    System.out.print("Ingrese Llaves de estilo {} () []: ");
    String variable = insert.nextLine();
    

    insert.close();
    System.out.println("Su expresion " + variable + " es " + (Verificacion(variable) ? "Correcta" : "Incorrecta"));
  }

  public static boolean Verificacion(String x) {

    List<Character> revision = new LinkedList<Character>();

    for (int i = 0; i < x.length(); i++) {
      revision.add(x.charAt(i));
    }

    for (int i = 0; i < revision.size(); i++) {
      if (revision.get(i) == '}' || revision.get(i) == ')' || revision.get(i) == ']') {
        return false;
      }

      if (revision.get(i) == '{') {
        if (revision.get(i + 1) == '}') {
          revision.remove(i);
          revision.remove(i + 1);
        }
      }

      if (revision.get(i) == '(') {
        if (revision.get(i + 1) == ')') {
          revision.remove(i);
          revision.remove(i + 1);
        }
      }

      if (revision.get(i) == '[') {
        if (revision.get(i + 1) == ']') {
          revision.remove(i);
          revision.remove(i + 1);
        }
      }
    }

    return false;
  }
}