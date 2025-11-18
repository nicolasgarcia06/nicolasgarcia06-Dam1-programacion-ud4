public class ParejasAscendentesDescendentes {
public static int contarAscendentes(int[] a){
    if(a.length < 2){
        return 0;
    }
    int suma=0;
 for(int i=0;i<a.length -1 ;i++){
    if(a[i] < a[i+1]){
suma++;
    }
}
return suma;
}
public static int contarDescendentes(int[] a){
    if(a.length < 2){
        return 0;
    }
    int suma=0;
 for(int i=0;i<a.length -1 ;i++){
    if(a[i] > a[i+1]){
suma++;
    }
}
return suma;
}
public static void main(String[] args) {
    int[]a={1,3,2,5};
int ascendentes=contarAscendentes(a);
System.out.println("ascendentes= "+ascendentes);
int[]b={4,2,2,1};
int descendentes=contarDescendentes(b);
System.out.println("descendentes= "+descendentes);
}
}