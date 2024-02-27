package lacos_condicionais;

import java.util.Scanner;

public class AtividadeIF2 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia um número inteiro via 
		teclado e mostre na tela uma mensagem indicando se este número é par 
		ou ímpar e se o número é positivo ou negativo. Veja os exemplos abaixo:*/

		int Numero;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		Numero = leia.nextInt();
		
		leia.close();
		
		 if (Numero % 2 ==0 ) {
			 System.out.print("O Numero " + Numero + " é par");
		 }else {
			 System.out.print("O Numero " + Numero + " é impar");
		 }
		 
		 if (Numero > 0 && Numero != 0) {
			 System.out.print(" e positivo!");
		 }else if (Numero < 0 && Numero != 0) {
			 System.out.print(" e negativo!");
		 }else {
			 System.out.print("!");
		 }

	}

}
