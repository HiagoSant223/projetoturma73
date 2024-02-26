package introducao;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float calcularMedia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Insira sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Insira sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		leia.close();
		
		calcularMedia = ((nota1 + nota2 + nota3 + nota4)/4);
		
		System.out.printf("Média Final: %.2f " , calcularMedia);

	}

}
