package vetor_matriz;

import java.util.Scanner;

public class AtividadeMatriz {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

		 //Declara as variaveis linhas, colunas, i, j, somaDiagonalPrincipal, somaDiagonalSecundaria
	        int linhas = 3;
	        int colunas = 3;
	        int i;
	        int j;
	        int somaDiagonalPrincipal;
	        int somaDiagonalSecundaria;
	        
	     //Declara a criação da matriz vazia [][]
	        int[][] matriz = new int[linhas][colunas];

	     //For: para interar sobre a matriz. I = 0; enquanto i for < que linhas; i ++
	        //For: para interar sobre a matriz. J = 0; enquanto J for < que colunas; J ++
	        //Scanne para Digitar os valores para posicao + i + j + e armazenar na Matriz[i][j] 
	        for (i = 0; i < linhas; i++) {
	            for (j = 0; j < colunas; j++) {
	                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }
	        
	        //Variavel somaDiagonalPrincipal começa em 0;
	        //For: i = 0; enquanto i for menor que linha; i ++
	        // somatoriaPrincipal recebe Matriz[i][j];
	        somaDiagonalPrincipal = 0;
	        for ( i = 0; i < linhas; i++) {
	            somaDiagonalPrincipal += matriz[i][i];
	        }

	        //somaDiagonalSecundaria recebe 0
	      //For: i = 0; enquanto i for menor que linhas; i ++
	        // somatoriaPrincipal recebe Matriz[i][linhas - 1 - i];
	        somaDiagonalSecundaria = 0;
	        for (i = 0; i < linhas; i++) {
	            somaDiagonalSecundaria += matriz[i][linhas - 1 - i];
	        }
	        
	        //Printar "Elementos da diagonal principal:"
	        //For: i = 0; enquanto i for menor que linhas; i++
	        //Printar: matriz[j][j];
	        System.out.println("Elementos da diagonal principal:");
	        for (i = 0; i < linhas; i++) {
	            System.out.print(matriz[i][i]);
	        }
	        
	        //Printar: " "
	        System.out.println();
	        
	        
	        //Printar: "Elementos da diagonal secundária:"
	        //For: i = 0; enquanto i for menor que linhas; i++
	        //Printar Matriz[i][linhas - 1 - i];
	        System.out.println("Elementos da diagonal secundária:");
	        for (i = 0; i < linhas; i++) {
	            System.out.print(matriz[i][linhas - 1 - i]);
	        }
	        
	        //Printar: ""
	        System.out.println();
	        
	        
	      //Printar: "soma diagonal principal"
	        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);
	        System.out.println("Soma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
	    }
	  }

