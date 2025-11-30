
public class RachaMasLargaa {
    public static int CalculaRacha(int[] a) {
        int t = 1;
        int max = 1;

        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                t++;
                if (t > max) {
                    max = t;
                }
            } else {
                t = 1; // reinicia la racha
            }
        }

        return max; // ¡esto faltaba!
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 2, 1, 1, 3};
        int total = CalculaRacha(a);
        System.out.println(total);
    }
}
