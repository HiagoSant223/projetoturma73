package lacos_condicionais;

import java.util.Scanner;

public class AtividadeSwitch2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String colaborador;
		int codigoCargo;
		float salario;
		float percentualReajuste;
		String cargo;
		
		System.out.println("Nome do Colaborador: ");
		colaborador = leia.nextLine();
		
		System.out.println("Cargo: ");
		codigoCargo = leia.nextInt();
		
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		leia.close();
		
		switch(codigoCargo) {
		case 1: 
			percentualReajuste = 0.10f;
			cargo = "Gerente";
			break;
		case 2: 
			percentualReajuste = 0.07f;
			cargo = "Vendedor";
			break;
		case 3: 
			percentualReajuste = 0.09f;
			cargo = "Supervisor";
			break;
		case 4: 
			percentualReajuste = 0.06f;
			cargo = "Motorista";
			break;
		case 5: 
			percentualReajuste = 0.05f;
			cargo = "Estoquista";
			break;
		case 6: 
			percentualReajuste = 0.08f;
			cargo = "Técnico de TI";
			break;
		default:
			System.out.println("Código inválido. Digite de 1 até 6 ");
			return;
		}
		
		float novoSalario = salario + (percentualReajuste * salario);
		
		System.out.println("Nome do colaborador: " + colaborador);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Sálario: R$ %.2f", novoSalario );

	}

}
