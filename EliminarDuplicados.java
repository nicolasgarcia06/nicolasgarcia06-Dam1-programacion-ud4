public class EliminarDuplicados {
public static void eliminarDuplicados(int[] array){
int suma=0;
    
for(int i=1;i<array.length;i++){
    if(array[i]!=array[i-1]){
        

System.out.print(array[i]+" ");
    }
    suma++;
}



}
public static void main(String[] args) {
    int [] array={1,1,2,2,2,3};
    eliminarDuplicados(array);
}
}
