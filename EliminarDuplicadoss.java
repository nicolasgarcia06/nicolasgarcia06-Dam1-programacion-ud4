public class EliminarDuplicadoss {
public static void CalculaDuplicados(int[]a){
    for (int i = 0; i < a.length-1; i++) {
        if(a[i]==a[i+1]){
continue;
        }
        System.out.print(a[i]+" ");
    }
}
public static void main(String[] args) {
    int[]a={1,1,2,2,2,3,3,3,3,3,4,5,6,7,8,8,8,8,9,9};
    CalculaDuplicados(a);
}
}
