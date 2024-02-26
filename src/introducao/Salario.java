package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		float salario;
		float abono;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Insira o Sálario: ");
		salario = leia.nextFloat();
		
		System.out.print("Insira o Abono: ");
		abono = leia.nextFloat();
		
		leia.close();
		
		novoSalario = salario + abono;
		
		System.out.println("Seu novo sálario é: " + novoSalario);

	}

}
