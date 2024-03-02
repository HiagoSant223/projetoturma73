package collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		
		Set<String> setFrutas = new HashSet<String>();
		
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add(null);
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		
		System.out.println("\nDados da Collection: " + setFrutas);
		
		for (String frutas : setFrutas) {
			if(frutas != null) {
			System.out.println("A posição de " + frutas + " é: " + frutas.hashCode());
			}
		}
	}

}
