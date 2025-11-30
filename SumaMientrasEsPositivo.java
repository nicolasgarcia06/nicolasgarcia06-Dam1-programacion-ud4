import java.util.Scanner;

public class SumaMientrasEsPositivo {
    public static void main(String[] args) {
        int suma = 0;
        int numeros;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("introduce un numero: ");
             numeros = sc.nextInt();
             suma +=numeros;
        }
            while(numeros!=-1);
            
            sc.close();
                
            
        
        System.out.print("la suma es: "+suma);
    }
}