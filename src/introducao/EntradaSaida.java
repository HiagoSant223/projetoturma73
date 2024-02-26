package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		// Entrada dos dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		nome = leia.nextLine();
		System.out.print("Insira sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Bom dia, " + nome);
		System.out.println("Sua idade é, " + idade);
		
		leia.close();

	}

}
