import java.util.Scanner;

public class SumaMientrasEsPositivoo {
public static void suma(){
    int suma=0;
Scanner sc = new Scanner(System.in);
while (true) {
    System.out.println("introduce el numero :");
    int numero=sc.nextInt();
    if(numero<0){
        break;
    }
    suma +=numero;
}
System.out.println("la suma es :"+suma);
sc.close();
}
public static void main(String[] args) {
    suma();
}
}
