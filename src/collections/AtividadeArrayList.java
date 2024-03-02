package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		Scanner leia = new Scanner (System.in);
		
		int iterar;
		String armazenar;
		
		
		System.out.print("Digite a próxima cor: ");
		
		for(iterar = 0; iterar < 5; iterar++) {
			armazenar = leia.nextLine();
			cores.add(armazenar);
		}
		
		System.out.println("\nListar todas as cores: ");
		
		System.out.println(cores);
		

		System.out.println("\nOrdenar as cores: ");

		
		Collections.sort(cores);
		
		for(String cor : cores) {
			System.out.println(cores);
			break;
		}

	}

}
