package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		
		int idade;
		boolean carteiraM;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Você tem carteira de habilitação? (true/false");
		carteiraM = leia.nextBoolean();
		
		if (idade >= 18 && carteiraM == true) {
			System.out.println("Pode dirigir!");
		}else {
			System.out.println("Não pode dirigir :( ");
		}
	}

}
