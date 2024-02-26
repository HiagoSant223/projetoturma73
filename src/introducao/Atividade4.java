package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float n1, n2, n3, n4;
        float diferenca;

        System.out.print("numero1: ");
        n1 = scanner.nextFloat();

        System.out.print("numero2: ");
        n2 = scanner.nextFloat();

        System.out.print("numero3: ");
        n3 = scanner.nextFloat();

        System.out.print("numero4: ");
        n4 = scanner.nextFloat();
        
        scanner.close();

        diferenca = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença: " + diferenca);

	}

}
