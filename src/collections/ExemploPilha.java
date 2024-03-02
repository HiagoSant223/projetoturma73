package collections;

import java.util.Stack;

public class ExemploPilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");

		System.out.println("\nElementos da Pilha: " + pilha);
		
		System.out.println("\nRetirar elemento: " + pilha.pop());

	}

}
