import java.util.Scanner;

public class TermometroHumano {
    public static void main(String[] args) {           
Scanner sc=new Scanner(System.in);
System.out.println("introduzca la temperatura corporal");
double temperatura=sc.nextDouble();
if(temperatura<0){
    System.out.println("muy frio");
}
else if(temperatura>=0 && temperatura<=10){
    System.out.println("frio");
}
else if(temperatura>=11 && temperatura<=20){
    System.out.println("templado");
}
else if(temperatura>=21 && temperatura<=30){
    System.out.println("calor");
}
else{
    System.out.println("mucho calor");
}
}
}