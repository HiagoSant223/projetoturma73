package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {
		
		Queue<String> filaClientes = new LinkedList<String>(); 
		
        Scanner leia = new Scanner(System.in);

        int opcao;
        
        do {
            System.out.println("*************************************");
            System.out.println(" ");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.println(" ");
            System.out.println("*************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    String nomeCliente = leia.next();
                    filaClientes.add(nomeCliente);
                    System.out.println("Cliente adicionado à fila.");
                    break;
                case 2:
                    if (filaClientes.size() == 0) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Clientes na fila:");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if (filaClientes.size() == 0) {
                        System.out.println("A fila está vazia.");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("Cliente foi chamado!");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        leia.close();
	}

}
