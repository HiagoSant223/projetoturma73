package atividadesComplementares;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		// Variaveis
				int valor, horas, min, seg;
				
				Scanner leia = new Scanner(System.in);
				
				// Entrada de Dados
				System.out.println("Insira o valor em segundos: ");
				valor = leia.nextInt();
				
				horas = valor / 3600;
				valor = valor % 3600; 
				
				min = valor / 60;
				valor = valor % 60; 
				
				seg = valor;
				
				leia.close();
				
				// Saída de Dados
				System.out.println("\nValor Formatado: " + horas + ":" + min + ":" + seg);
				
				
	}

}
