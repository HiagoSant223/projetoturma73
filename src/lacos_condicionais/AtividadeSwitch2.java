package lacos_condicionais;

import java.util.Scanner;

public class AtividadeSwitch2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String colaborador;
		int codigoCargo;
		float salario;
		double percentualReajuste;
		String cargo;
		
		System.out.println("Nome do Colaborador: ");
		colaborador = leia.nextLine();
		
		System.out.println("Cargo: ");
		codigoCargo = leia.nextInt();
		
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		switch(codigoCargo) {
		case 1: 
			percentualReajuste = 0.10;
			cargo = "Gerente";
			break;
		case 2: 
			percentualReajuste = 0.07;
			cargo = "Vendedor";
			break;
		case 3: 
			percentualReajuste = 0.09;
			cargo = "Supervisor";
			break;
		case 4: 
			percentualReajuste = 0.06;
			cargo = "Motorista";
			break;
		case 5: 
			percentualReajuste = 0.05;
			cargo = "Estoquista";
			break;
		case 6: 
			percentualReajuste = 0.08;
			cargo = "Técnico de TI";
			break;
		default:
			System.out.println("Código inválido. Digite de 1 até 6 ");
			return;
		}
		
		double novoSalario = salario + (percentualReajuste * salario);
		
		System.out.println("Nome do colaborador: " + colaborador);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Sálario: %.2f", novoSalario );

	}

}
