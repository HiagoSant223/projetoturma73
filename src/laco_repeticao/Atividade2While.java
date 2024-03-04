package laco_repeticao;

import java.util.Scanner;

public class Atividade2While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int idade, identidadeGen, pessoaDev;
        int numBackend = 0, numFrontendMulheres = 0, numFrontendHomens = 0;
        int numMobileHomens = 0, numMobileMulheres = 0;
        int numFullStack = 0, numFullStackNaoBinarios = 0;
        int numTotal = 0, somaIdades = 0;

        char continuar = 'S';

        while (continuar == 'S') {
            System.out.println("Digite a idade do colaborador:");
            idade = scanner.nextInt();
            somaIdades += idade;
            numTotal++;

            System.out.println("Identidade de Gênero: \n1 – Mulher Cis \n2 – Homem Cis \n3 – Não Binário \n4 – Mulher Trans \n5 – Homem Trans \n6 – Outros");
            identidadeGen = scanner.nextInt();

            System.out.println("Pessoa Desenvolvedora: \n 1 – Backend \n 2 – Frontend \n 3 – Mobile \n 4 – FullStack");
            pessoaDev = scanner.nextInt();

            switch (pessoaDev) {
                case 1:
                    numBackend++;
                    break;
                case 2:
                    if (identidadeGen == 1 || identidadeGen == 4) {
                        numFrontendMulheres++;
                    } else if (identidadeGen == 2 || identidadeGen == 5) {
                        numFrontendHomens++;
                    }
                    break;
                case 3:
                    if (identidadeGen == 1 || identidadeGen == 4) {
                        numMobileMulheres++;
                    } else if (identidadeGen == 2 || identidadeGen == 5) {
                        numMobileHomens++;
                    }
                    break;
                case 4:
                    numFullStack++;
                    if (identidadeGen == 3) {
                        numFullStackNaoBinarios++;
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("Deseja adicionar outro colaborador? (S/N)");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("Número de pessoas desenvolvedoras Backend: " + numBackend);
        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + numFrontendMulheres);
        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + numMobileHomens);
        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + numFullStackNaoBinarios);
        System.out.println("Número total de pessoas que responderam à pesquisa: " + numTotal);
        System.out.println("Média de idade das pessoas que responderam à pesquisa: " + (somaIdades / numTotal));

        scanner.close();
	}

}
