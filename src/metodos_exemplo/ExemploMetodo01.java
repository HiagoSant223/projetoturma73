package metodos_exemplo;

import metodos_exemplo.ExemplosMetodos02;

public class ExemploMetodo01 {

		public static void main(String[] args) {
			
			
			int resultado = somar(2,5); // resultado = 7
			// String texto = mensagem(); não retorna informação
			
			System.out.println("O primeiro resultado é: " + resultado);
			
			// Executando Método c/ Retorno e com Parametro 
			System.out.println("O segundo resultado é: " + somar(8,3));
			
			// Executando Método s/ Retorno e sem Parametro
			ExemplosMetodos02.mensagem();	// Estamos importando esse método do outro Arquivo
			
			// Executando Método s/ Retorno e com Parametro 
			saudacao("\nOi, sei lá");
			saudacao("Bom dia");		
		}
		
		// Criando o método c/ retorno e c/ parametro
		public static int somar(int num1, int num2) {
			return num1 + num2;
		}
		
		// Criando o método s/ retorno e c/ parametro
		public static void saudacao(String mensagem) {
			System.out.println(mensagem);
		}

}
