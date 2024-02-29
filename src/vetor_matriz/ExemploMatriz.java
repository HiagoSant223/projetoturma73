package vetor_matriz;

public class ExemploMatriz {

	public static void main(String[] args) {
	
		// Matriz vazia com 3 linha e 3 colunas
		//int [][] matriz = new int [3][3];
		
		int numeros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		
		int linha;
		int coluna;
		
		
		// Percorrer as linhas da matriz
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.println("Numeros [" + linha + "][" + coluna + "]: " + numeros[linha][coluna]);
			}
		}
		System.out.println();

	}

}
