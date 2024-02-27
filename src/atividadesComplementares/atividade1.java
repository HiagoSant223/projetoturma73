package atividadesComplementares;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		double A;
		double B;
		double soma;
		double diferenca;
		double multiplicacao;
		double divisao; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor A: ");
		A = leia.nextDouble();
		
		System.out.println("Digite o valor B: ");
		B = leia.nextDouble();
		
		leia.close();
		
		soma = A + B;
		
		diferenca = A - B;
		
		multiplicacao = A * B;
		
		divisao = A / B;


        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Diferença: %.2f\n", diferenca);
        System.out.printf("Multiplicação: %.2f\n", multiplicacao);
        System.out.printf("Divisão: %.3f\n" , divisao);
		

	}

}
