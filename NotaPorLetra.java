import java.util.Scanner;

public class NotaPorLetra {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("introduzca una letra (A,B,C,D,F)");  
  String letra=sc.nextLine().toUpperCase().toLowerCase();
switch (letra) {
    case "a" -> System.out.println("sobresaliente");
    case "b" -> System.out.println("notable");
    case "c" -> System.out.println("bien");
    case "d" -> System.out.println("suficiente");
    case "f" -> System.out.println("insuficiente");
    default -> System.out.println("letra no valida");
}
}
}
