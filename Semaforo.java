import java.util.Scanner;
public class Semaforo {

    public String accionSemaforoIf(String color){
        if(color.equalsIgnoreCase("rojo")){
            return "Para";
        }
        else if(color.equalsIgnoreCase("amarillo")){
return "Atento";
        }
        else if(color.equalsIgnoreCase("verde")){
return "Pasa";
        }
        else{
            return "Color invalido";
        }
    }

    public String accionSemaforoSwitch(String color){
        return switch (color) {
            case "rojo" -> "Para";
            case "amarillo" ->"Atento";
            case "verde" ->"Pasa";
            default -> "color invalido";
            
        };
    }

    public static void main(String[] args){
        Semaforo semaforo = new Semaforo();
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce un color");
        String color=sc.nextLine();
String resultado=semaforo.accionSemaforoIf(color);
System.out.println(resultado);
String resultado2=semaforo.accionSemaforoSwitch(color);
System.out.println(resultado2);
sc.close();
        // Pedir color al usuario usando Scanner
        // Llamar a método accionSemaforoIf
        // Mostrar por pantalla (System.out) el resultado
        // Llamar a método accionSemaforoSwitch
        // Mostrar por pantalla (System.out) el resultado
 
    }
}