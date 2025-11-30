import java.util.Scanner;

public class LoopMaster {
public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    do{

        System.out.print("introduce numero: ");
     n=sc.nextInt();
    }
    while(n<1);
     contarHastaN(n);
imprimirSumaHastaN(n);
imprimirTablaMultiplicar(n);
 sc.close();
}
public static void contarHastaN(int n){
    for (int i = 1; i <= n; i++) {
        System.out.print(i+" ");
    }
    System.out.println();
}
public static void imprimirSumaHastaN(int n){
    int suma=0;
    for (int i = 1; i <= n; i++) {
        suma +=i;
        
}
System.out.println("Suma = "+suma);
}
public static void imprimirTablaMultiplicar(int n){
    for (int i = 1; i <= 10; i++) {
System.out.println(n+" X "+i+" = "+(n*i));
}
}
}