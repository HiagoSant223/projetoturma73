package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeSet {

	public static void main(String[] args) {
		
		Set<Integer> valores = new HashSet<Integer>();
		
		int valor;
		int armazenar;

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o proximo valor: ");
		
		for(valor = 0; valor < 10; valor++) {
			armazenar = leia.nextInt();
			valores.add(armazenar);
		}
		
		System.out.println("Listar dados do Set: ");
		
		Iterator<Integer> iterator = valores.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
