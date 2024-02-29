package vetor_matriz;

import java.util.Scanner;

public class AtividadeVetor {

	public static void main(String[] args) {
			
		// Definição de variaveis: Vetor, Indice, Numero e Posicao
			int indice;
			int numero;
			int posicao = -1;
			
			int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
			
			Scanner leia = new Scanner (System.in);
			
		// Scanner leia, recebe numero de entrada
			System.out.println("Digite o número que você deseja encontrar: ");
			numero = leia.nextInt();
			
		
		 // For com: Indice começa em 0. Que recebe o tamanho do vetor. E soma++
		// If: Se o indice do Vetor for == numero --> Então Posicao recebe indice. Break
			for(indice = 0; indice < vetor.length; indice++) {
				if(vetor[indice] == numero) {
					posicao = indice;
					break;
				}
			}
			
		// If: se posicao for difrente de -1; então print Numero e Posicao. 
			
			if(posicao != -1) {
				System.out.println("O número " + numero + " está localizado na posição: " + posicao);
	        } else {
	            System.out.println("O número " + numero + " não foi encontrado!");
	      }
      }		
}
