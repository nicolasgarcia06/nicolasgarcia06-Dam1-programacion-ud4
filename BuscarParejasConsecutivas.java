public class BuscarParejasConsecutivas {
public static int BuscarParejas(int[] a){
    int contador=0;
    
if (a.length < 2) {
            return 0; // Si el array tiene menos de 2 elementos, no hay parejas
        }

    for(int i=0;i<a.length -1 ;i++){
if(a[i] == a[i+1]){
contador++;

}

    }
    return contador;
}
public static void main(String[] args) {
    int[] a={1,1,2,2,2,3,3};
   int parejas= BuscarParejas(a);
   System.out.println(parejas);
}
}
