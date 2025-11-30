public class ParesEImpares {
public static void CalculoParImpar(int[]a){
    for (int i = 0; i < a.length; i++) {
        if(a[i] %2==0){
            System.out.println("numeros pares: "+a[i]);
        }
        if(a[i] %2!=0){
            System.out.println("numeros impares: "+a[i]);
        }
    }
}
public static void main(String[] args) {
    int[]a={5, 8, 3, 10, 7, 6};
    CalculoParImpar(a);
}
}
