package lacos_condicionais;

import java.util.Scanner;

public class AtividadeIF1 {

	public static void main(String[] args) {
		/* Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e 
		 * imprima na tela se a soma de A + B é maior, menor ou igual a C.
		 */
		
		int A, B, C;
		int soma;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o número A: ");
        A = leia.nextInt();
        
        System.out.print("Digite o número B: ");
        B = leia.nextInt();
        
        System.out.print("Digite o número C: ");
        C = leia.nextInt();
        
        leia.close();
        
        soma = A + B;
        
        if (soma > C) {
        	System.out.print("A soma de A + B é Maior do que C.");
        }else if (soma == C) {
        	System.out.print("A soma de A + B é Igual do que C.");
        }else {
        	System.out.print("A soma de A + B é Menor do que C.");
        }

	}

}
