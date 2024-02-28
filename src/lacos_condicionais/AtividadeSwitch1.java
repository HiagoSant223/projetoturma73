package lacos_condicionais;

import java.util.Scanner;

public class AtividadeSwitch1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		float preco;
		String produto;
		
		System.out.print("Código do Produto: ");
		codigo = leia.nextInt();
		
		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		
		
		switch (codigo) {
		case 1:
			preco = 10.00f;
			produto = "Cachorro Quente";
			break;
		case 2:
			preco = 15.00f;
			produto = "X-Salada";
			break;
		case 3:
			preco = 18.00f;
			produto = "X=Bacon";
			break;
		case 4: 
			preco = 12.00f;
			produto = "Bauro";
			break;
		case 5:
			preco = 8.00f;
			produto = "Refrigerante";
			break;
		case 6:
			preco = 13.00f;
			produto = "Suco de Laranja";
			break;
		default:
			System.out.println("Código do produto inválido! (1 até 6)");
			return;
		}
		
		float valorTotal = quantidade * preco;
		
		System.out.println("Produto: " + produto);
        System.out.printf("Valor total: R$ %.2f", valorTotal);
		
        
	}

}
