import java.util.Arrays;
import java.util.Scanner;

public class RellenarArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("introduce numero mayor que 1");
    int n=sc.nextInt();sc.nextLine();
    int [] array =new int[n];
    for(int i=0;i<n;i++){
         System.out.print("Introduce elemento "+(i+1)+": ");
            array[i] = sc.nextInt();
            sc.nextLine();


    }
Arrays.stream(array).forEach(System.out::println);
}
}
