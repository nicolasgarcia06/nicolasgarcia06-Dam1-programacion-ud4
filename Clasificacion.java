import java.util.Scanner;

class Calificacion {

    public String obtenerCalificacion(double valor) {
        if (valor >= 0 && valor <= 4) {
            return "insuficiente";

        } else if (valor == 5) {
            return "aprobado";
        } else if (valor == 6) {
            return "bien";
        } else if (valor >= 7 && valor <= 8) {
            return "notable";
        } else if (valor >= 9 && valor <= 10) {
            return "sobresaliente";
        } else {
            return "nota invalida";
        }
    }

    public static void main(String[] args) {
        Calificacion programa = new Calificacion();
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una nota");
        double valor = sc.nextDouble();

        // Pedir nota por pantalla
        // nota = 0.0;
        String calificacion = programa.obtenerCalificacion(valor);
        // Mostrar calificacion
        System.out.println(calificacion);
        sc.close();
    }
}
