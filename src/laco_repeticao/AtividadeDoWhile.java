package laco_repeticao;

import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		float multiplo3 = 0f;
		float quantidade = 0f;
		float media;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0 ) {
				multiplo3 += numero;
				quantidade++;
			}
		}while(numero != 0);
		
		leia.close();
		
		media = multiplo3 / quantidade;
		
		System.out.println(multiplo3);
		System.out.println(quantidade);
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
	  }
   }
