package atividadesComplementares;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		double n;
		double raio;
		double calculo;
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o valor de N: ");
		n = dados.nextDouble();
		
		System.out.println("Digite o valor do Raio: ");
		raio = dados.nextDouble();
		
		dados.close();
		
		raio = raio * 2;
		
		n = 3.14159;
		
		calculo = raio * n;
		
		
		System.out.printf("Area: %.4f", calculo);
		
		

	}

}
