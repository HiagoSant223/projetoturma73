package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String cachorro[] = new String[3];
		int indice;
		
		// Guarda os nomes
		for(indice = 0; indice < 3; indice++) {
			System.out.println("Digite o " + (indice + 1) + "° cachorro: ");
			cachorro[indice] = leia.nextLine();
			
			//System.out.println("Nome do cachorro " + (indice + 1) + ": " + cachorro[indice]);
			//System.out.println(cachorro);
		}
		System.out.println(cachorro.length);
		
		// Lista os nomes
		//for(indice = 0; indice < cachorro.length; indice++) {
			// System.out.println("Nome do cachorro " + (indice + 1) + ": " + cachorro[indice]);
		//}
		
	}

}
