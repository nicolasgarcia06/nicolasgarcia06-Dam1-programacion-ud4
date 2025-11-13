import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuInteractivoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("-- MENU--");
            System.out.println("1. Hola");
            System.out.println("2. Hora");
            System.out.println("3. Eco");
            System.out.println("4. Salir");
            System.out.print("Elige: ");

            try {
                String numero = sc.nextLine();
                n = Integer.parseInt(numero);
                switch (n) {
                    case 1 -> {
                        
                        System.out.println("hola");
                    }
                    case 2 -> {
                        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                        System.out.println(hora);
                    }
                    case 3 -> System.out.println("adios");
                    default ->
                        System.out.println("opcion no valida");

                }
            } catch (Exception e) {
                System.out.println("error,introduce:");
            }
        } while (n != 3);
        sc.close();

    }
}
