import java.util.Scanner;

public class NotaMediaa {
public static void CalculoMedia(){
    Scanner sc = new Scanner(System.in);
    double n;
    int contador=0;
    double suma=0;
    do{
    System.out.print("introduce numero: ");
    try{
     String numero=sc.nextLine();
     n=Double.parseDouble(numero);
     if(n==-1){
        break;
     }
     else if(n>=0 && n<=10){
        suma +=n;
contador ++;
     }
     else{
        System.out.println("nota no valida");
     }
    }
     catch(Exception e){
        System.out.println("error, introduce otro numero");
     }
    }
     while(true);{
        if(contador>0){
            double media=suma/contador;
            System.out.printf("La media es %.1f",media);
        }
        else{
            System.out.println("no hay datos");
        }
        sc.close();
     }
    
    }
    public static void main(String[] args) {
        CalculoMedia();
    }
}

