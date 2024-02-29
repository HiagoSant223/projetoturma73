package vetor_matriz;

import java.util.Scanner;

public class AtividadeMatriz {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        int linhas = 3;
	        int colunas = 3;

	        int[][] matriz = new int[linhas][colunas];

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }

	        int somaDiagonalPrincipal = 0;
	        for (int i = 0; i < linhas; i++) {
	            somaDiagonalPrincipal += matriz[i][i];
	        }

	        int somaDiagonalSecundaria = 0;
	        for (int i = 0; i < linhas; i++) {
	            somaDiagonalSecundaria += matriz[i][linhas - 1 - i];
	        }

	        System.out.println("Elementos da diagonal principal:");
	        for (int i = 0; i < linhas; i++) {
	            System.out.print(matriz[i][i]);
	        }
	        System.out.println();

	        System.out.println("Elementos da diagonal secundária:");
	        for (int i = 0; i < linhas; i++) {
	            System.out.print(matriz[i][linhas - 1 - i]);
	        }
	        System.out.println();

	        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);
	        System.out.println("Soma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
	    }
	  }

