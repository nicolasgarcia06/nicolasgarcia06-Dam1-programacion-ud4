import java.util.Scanner;

public class ParImparMultiplo {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("introduzca un numero entero");
     int numero=sc.nextInt();
     
if(numero%2==0){
System.out.println("par");
}
else if(numero%2==0 && numero/3==numero){
    System.out.println("es par y multiplo de tres");
}
else if(numero%2!==0 && numero/3==numero){
    System.out.println("es impar y multiplo de tres");
}
else{
    System.out.println("impar");
}
}
}
