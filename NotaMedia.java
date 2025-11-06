import java.util.Scanner;

public class NotaMedia {
public static void Notas(){
    Scanner sc = new Scanner(System.in);
    int nota;
    int suma=0;
    int contador=0;
    
    do{
        System.out.println("introduce una nota del 1 al 10");
        nota=sc.nextInt();
if(nota==-1){
    break;
}
    else if(nota>0 && nota<10){
suma +=nota;
contador++;
    }
    else{
        System.out.println("Nota invalida");
    }

    }
while(true);{
     if(nota>0 && nota<10){
int media=suma/contador;
System.out.println("la media es:%d"+media);
}
else{
    System.out.println("no hay datos");
}
}
sc.close();
}
public static void main(String[] args) {
    Notas();
}
}