package collections;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		Scanner leia = new Scanner (System.in);
		
		int opcao;
		
		do {
			System.out.println("*************************************");
            System.out.println(" ");
            System.out.println("1 - Adicionar Livro na Pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da Pilha");
            System.out.println("0 - Sair");
            System.out.println(" ");
            System.out.println("*************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();
            
            switch(opcao) {
            case 1: 
            	System.out.println("Digite o nome: ");
            	String nomeLivro = leia.next();
            	pilha.add(nomeLivro);
            	System.out.println("Livro Adicionado");
            	break;
            case 2: 
	            	if(pilha.size() == 0) {
	            		System.out.println("Pilha está vazia!");
	            	}else {
	            		System.out.println("Livro está na pilha");
	            		for(String livros : pilha) {
	            			System.out.println(pilha);
	            	}
            	}
            	break;
            case 3: 
            	if(pilha.size() == 0) {
            		System.out.println("Pilha está vazia!");
            	}else {
            		String livroRetirado = pilha.pop();
            		System.out.println("Um Livro  " + livroRetirado + "foi retirado da pilha!");
            	}
            	break;
            case 0:
            	System.out.println("Programa finalizado.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
               }
			}while(opcao != 0);
		leia.close();
	  }
}
