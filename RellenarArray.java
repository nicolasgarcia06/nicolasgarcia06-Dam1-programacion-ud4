 class RellenarArray{
public static void main(String[] args) {
    int[][] notas = new int[][]{
            {3,4,5},
            {3,6,5},
            {7,8,5},
            {7,7,5}
    };
double[]media=CalculaMedia(notas);
double total=NotaAlta(media);
System.out.println(total);
}
public static double[] CalculaMedia(int[][]notas){
    double[]medias=new double[notas.length];
    for(int i=0;i<notas.length;i++){
        double suma=0;
        for(int j=0;j<notas[i].length;j++){
            suma +=notas[i][j];
        }
        medias[i]=suma/notas[i].length;
    }
    return medias;
}
public static double NotaAlta(double[]media){
int mejor=0;
for(int i=1;i<media.length;i++){
    if(media[i]>media[mejor]){
        mejor=i;
    }
}
return media[mejor];
}
}