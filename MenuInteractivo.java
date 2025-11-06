import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuInteractivo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    do{
        System.out.println("-- MENU--");
        System.out.println("1. Hola");
        System.out.println("2. Hora");
        System.out.println("3. Eco");
        System.out.println("4. Salir");
        System.out.print("Elige: ");
         opcion = sc.nextInt();sc.nextLine();
        switch (opcion) {
            case 1 -> System.out.println("Hola");
            case 2 ->{ String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
System.out.println(hora);}
case 3 ->{ System.out.print("texto:");String texto=sc.nextLine();System.out.println(texto);}
case 4 -> System.out.println("adios");
default -> System.out.println("Opcion no valida");

        }
        
    }
    while(opcion!=4);
        
    
    
sc.close();


}
}
