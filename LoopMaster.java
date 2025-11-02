public class LoopMaster {
public static void contarHastaN(int n) {
    for (int i = 1; i <= n; i++) {
        System.out.println(i);
    }
}
public static void imprimirSumaHastaN(int n) {
    int suma = 0;
    for (int i = 1; i <= n; i++) {
        suma += i;
        System.out.println("Suma hasta " + i + ": " + suma);
    }
}
public static void imprimirTablaMultiplicar(int n) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
    }
}
}
