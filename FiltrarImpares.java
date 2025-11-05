public class FiltrarImpares {
public static void FiltrarImpares(int[] array){
    for(int i=0;i<array.length;i++){
        if(array[i] % 2==0){
            continue;
        }
 System.out.print(array[i]+" ");
    }
    
}
public static void main(String[] args) {
    int[] numero= {1,2,3,4,5,6,7,8,9,10};
    FiltrarImpares (numero);
    
}
}
