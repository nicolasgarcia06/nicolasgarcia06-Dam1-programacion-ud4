import java.util.Scanner;

public class PintandoPatrones {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=0;
    do{
        System.out.println("-- MENÚ PATRONES --");
 System.out.println("1. Cuadrado sólido");
 System.out.println("2. Cuadrado hueco");
 System.out.println("3. Triángulo recto");
 System.out.println("4. Pirámide centrada");
 System.out.println("5. Salir"); 
System.out.println("Elige:");
try{
    String opcion= sc.nextLine();
    n=Integer.parseInt(opcion);
    switch (n) {
        case 1 -> pintarCuadradoSolido(n);
        case 2 ->  pintarCuadradoHueco(n);
        case 3 -> pintarTriangulo(n);
        case 4 -> pintarPiramide(n) ;
                case 5 -> System.out.println("salir");
        default ->System.out.println("otra opcion");
    }
}
catch(Exception e){
    System.out.println("error, itroduce otro numero");
}
    }
while (n !=5);
sc.close();
}

static void pintarCuadradoSolido(int n){
     Scanner sc=new Scanner(System.in);
     do{
if(n>=1){
System.out.println("introduce numero:");
 n=sc.nextInt();
}
            }
            while(n<1);
            sc.close();
}

    static void pintarCuadradoHueco(int n) {
        Scanner sc = new Scanner(System.in);
        if (n >= 2) {
            System.out.println("introduce numero:");
            n = sc.nextInt();
        } else {
            System.out.println("error");
        }
        sc.close();
    }

    static void pintarTriangulo(int n) {
        Scanner sc = new Scanner(System.in);
        if (n >= 1) {
            System.out.println("introduce numero:");
            n = sc.nextInt();
        } else {
            System.out.println("error");
        }
        sc.close();
    }

    static void pintarPiramide(int n) {
        Scanner sc = new Scanner(System.in);
        if (n >= 1) {
            System.out.println("introduce numero:");
            n = sc.nextInt();
        } else {
            System.out.println("error");
        }
        sc.close();
    }

    
}
