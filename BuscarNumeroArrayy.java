import java.util.Scanner;

public class BuscarNumeroArrayy {
    public static void CalculoArray(int[] a, int numero) {
        for (int i = 0; i < a.length; i++) {
            if(numero!=a[i]){
System.out.println("no encontrado");
            }
            if (numero == a[i]) {
                System.out.println("El numero es " + numero + " encontrado en la posicion " + i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero: ");
        int numero = sc.nextInt();
int [] a={3, 8, 15, 9, 8, 22, 7};
CalculoArray(a, numero);
sc.close();
    }
}
