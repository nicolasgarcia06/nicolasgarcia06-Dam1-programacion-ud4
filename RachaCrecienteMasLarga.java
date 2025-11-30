public class RachaCrecienteMasLarga {
public static int CalculaRachaCreciente(int[]a){
    int t=1;
    int max=1;
    if(a.length==0){
        return 0;
    }
    for (int i = 0; i< a.length-1; i++) {
        if(a[i]<a[i+1]){
t++;
if(t>max){
    max=t;
}

        }
        else {
    t=1;

}
    }
    return max;
}
public static void main(String[] args) {
    int[]a={1,3,5,4,6,7,8};
   int total= CalculaRachaCreciente(a);
   System.out.println(total);
}
}
