package introducao;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira seu salario bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Insira adicional norturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Insira horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Insira descontos: ");
		descontos = leia.nextFloat();
		
		leia.close();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos);
		
		System.out.println("Salário Liquido: " + salarioLiquido);


	}

}
