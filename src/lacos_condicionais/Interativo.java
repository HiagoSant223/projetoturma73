package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int x;
		int y;
		
		System.out.println("Digite valor de X: ");
		x = leia.nextInt();
		
		System.out.println("Digite valor de Y: ");
		y = leia.nextInt();
		
		leia.close();
		
		if (x > y) {
			System.out.println("X é maior que Y");
		}else if (x == y) {
			System.out.println("Não tem maior");
		}else {
			System.out.println("Y é maior que X");
		}
	}

}
