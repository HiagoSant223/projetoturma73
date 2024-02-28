package laco_repeticao;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		int maior21 = 0;
		int maior50 = 0;
		
		System.out.println("Digite a idade da pessoa: ");
		idade = leia.nextInt();
		
		while(idade > 0) {
			int teste;
			
			if(idade <= 21) {
				maior21++;
			}else if (idade >= 50){
				maior50++;
			}
			System.out.println("Digite a idade da pessoa: ");
			idade = leia.nextInt();
			
			teste = 0;
		}
		
		
		
		leia.close();
		
		System.out.println("Total de pessoas menores de 21 anos: " + maior21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
			
	}
		
}

