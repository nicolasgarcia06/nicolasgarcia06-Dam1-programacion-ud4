import java.util.Scanner;

public class SumaMientrasEsPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while (true) {
            System.out.print("Introduce un numero: ");
            int numero = sc.nextInt();
            if (numero < 0) {
                break;
            }
            suma += numero;

        }
        System.out.println("la suma es:" + suma);
        sc.close();
    }
}
