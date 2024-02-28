package laco_repeticao;

import java.util.Scanner;

public class AtividadeFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	    
		int primeiro, segundo;
		int multiplo;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		primeiro = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		segundo = leia.nextInt();
		 
		leia.close();
		
		if(primeiro >= segundo) {
			System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
			return;
		}
		
		System.out.println("No Intervalo entre " + primeiro + " e " + segundo + ":");
		
		for(multiplo = primeiro; multiplo <= segundo; multiplo++) {
			if(multiplo % 3 == 0 && multiplo % 5 == 0) {
				System.out.println(multiplo + " é múltiplo de 3 e 5");
			}
		}
	}

}
