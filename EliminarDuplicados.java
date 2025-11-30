public class EliminarDuplicados {
	
	
		
	public static String buscarLetra(String texto,int posicion) {
		try {
			return Character.toString(texto.charAt(posicion));
		}catch(Exception ex) {
			return "Letra no encontrada";
		}
		
	}
	
	
	public static String buscarYRemplazarTexto(String p1,
			String p2,String p3 ) {
		if (p1.contains(p2)) {
			return p1.replace(p2, p3);
		}else {
			return "Texto no encontrado";
		}
		
	}
	
	public static void pintarDoble(int numero) {
		
		System.out.println(2*numero);
	}
	
	//
	public static int buscarNumeroOcurrencias(String texto, char c) {
		int contador = 0;
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)==c) {
				contador++;
			}
		}
		return contador;
	}
	
	
	public static void main(String[] args) {
		
		
		
	
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu texto: ");
		String texto = sc.nextLine();
		System.out.print("Introduce un caracter: ");
		char caracter = sc.nextLine().charAt(0);
		
		int total = buscarNumeroOcurrencias(texto, caracter);
		System.out.printf("Aparece %d veces", total);
		
		
		
		System.out.print("Texto a buscar: ");
		String textoARemplazar = sc.nextLine();		
		System.out.print("Nuevo a texto: ");
		String textoNuevo = sc.nextLine();	
		String textoRemplazado = buscarYRemplazarTexto(texto,textoARemplazar,textoNuevo);
		System.out.printf("Texto remplazado: %s%n",textoRemplazado);
		System.out.print("Introduce tu posición: ");
		int posicion = sc.nextInt();
		String letra = buscarLetra(textoRemplazado,posicion);
		System.out.println(letra);
		
		sc.close();
 
	}
 
}
 