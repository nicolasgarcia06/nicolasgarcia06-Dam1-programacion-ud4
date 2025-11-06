import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void Adivina(){
        final int MIN=0;
        final int MAX=100;
        int secreto = MIN + new Random().nextInt(MAX - MIN + 1);
        int intentos=0;
        System.out.println("estoy pensando un numero del 0 al 100");
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Tu intento: ");
            try{
String numero=sc.nextLine();
n=Integer.parseInt(numero);
if(n>MIN && n<MAX){
    if(n<secreto){
    System.out.println("mayor");
    }
    else if(n>secreto){
        System.out.println("menor");
    }
    else if  (secreto==n) {
System.out.println("acertaste en"+intentos+ "el numero era "+secreto);
break;
}
}
            }



    

catch(Exception e){
System.out.println("no valido,introduce otro numero");
}
finally{
    intentos++;
}
            }
            sc.close();
        }
        public static void main(String[] args) {
            Adivina();
        }
    }

