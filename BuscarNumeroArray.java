import java.util.Scanner;

public class BuscarNumeroArray {
public static void numeroArray(int[] array){
     Scanner sc = new Scanner(System.in);
     int numero=sc.nextInt();
    int contador=0;
    
for(int i=0;i<array.length;i++){
    if(array[i]==numero){
        
        System.out.println("encontrado en posicion:"+contador+"numero"+numero);
        
break;
    }
    
    contador++;
}

}
public static void main(String[] args) {
        int [] array={3, 8, 15, 9, 8, 22, 7};
    numeroArray(array);
}
}
