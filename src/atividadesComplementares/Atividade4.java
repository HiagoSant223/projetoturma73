package atividadesComplementares;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		int valor;
		int notasCem, notasCiq, notasVinte, notasDez, notasCinco, notasDois, notasUm;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o valor: ");
		valor = leia.nextInt();
		
		notasCem = valor /100;
		valor = valor % 100;
		
		notasCiq = valor /50;
		valor = valor % 50;
		
		notasVinte = valor / 20;
		valor = valor % 20;
		
		notasDez = valor / 10;
		valor = valor % 10;
		
		notasCinco = valor / 5;
		valor = valor % 5;
		
		notasDois = valor / 2;
		valor = valor % 2;
		
		notasUm = valor;
		
		System.out.printf("%d nota(s) de R$ 100,00%n", notasCem);
        
        System.out.printf("%d nota(s) de R$ 50,00%n", notasCiq);
               
        System.out.printf("%d nota(s) de R$ 20,00%n", notasVinte);

        System.out.printf("%d nota(s) de R$ 10,00%n", notasDez);

        System.out.printf("%d nota(s) de R$ 5,00%n", notasCinco);

        System.out.printf("%d nota(s) de R$ 2,00%n", notasDois);

        System.out.printf("%d nota(s) de R$ 1,00%n", notasUm);

        leia.close();	
		

	}

}
