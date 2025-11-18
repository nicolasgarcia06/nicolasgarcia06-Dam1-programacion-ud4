class EncontrarMejorRacha {
    public static void main(String[] args) {
        int[] elementos = new int[] { 0, 2, 2, 1, 4, 4, 4, 3, 3 };
        int rachaActual = 1;
        int mejorRacha = 1;
        for (int i = 1; i < elementos.length; i++) {
            if (elementos[i] == elementos[i - 1]) {
                rachaActual++;
                mejorRacha = Integer.max(rachaActual, mejorRacha);
                continue;
            }
            rachaActual = 1;
        }
        System.out.printf("Mejor racha: %d elementos.%n", mejorRacha);
    }
}
