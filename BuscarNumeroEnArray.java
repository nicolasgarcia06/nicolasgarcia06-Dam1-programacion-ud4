import java.util.Scanner;

public class BuscarNumeroEnArray {
    public static void main(String[] args) {
        int posicion=0;
        
        Scanner sc = new Scanner(System.in);
    System.out.println("introduzca un numero a buscar");
    int numeroBuscado=sc.nextInt();
int[] numeros= {3, 8, 15, 9, 8, 22, 7};
for(int i=0;i<numeros.length;i++){
    if(numeros[i]==numeroBuscado){
        
        System.out.println("el numero"+numeroBuscado+"se encuentra en la posicion"+posicion);
        
        break;
    }
posicion++;

}
  

}
}
