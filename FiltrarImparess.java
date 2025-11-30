public class FiltrarImparess {
public static void main(String[] args) {
    int [] array={1,2,3,4,5,6};
    
    ParImpar(array);
}
public static void ParImpar(int[] array){
for(int i=0;i<array.length;i++){
    if(array[i] %2==0){
        continue;
    }
    System.out.print(array[i]+ " ");
}

}
}
