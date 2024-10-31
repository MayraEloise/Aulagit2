package Recuperacao;

import java.util.*;

public class at2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		/*
		 * 2) Implemente um algoritmo que consiga exibir o seguinte menu de opções ao
		 * usuário:
		 * 
		 * MENU DE OPÇÕES: 1.Calcular lucro 2.Primo 3.Múltiplos de 3 4.Fatorial 5.Sair
		 * OPÇÃO:
		 * 
		 * O algoritmo deve permanecer exibindo o menu e solicitando ao usuário pelo
		 * valor da opção, até que o usuário informe a opção 5. Sair. Neste caso, o
		 * algoritmo deve ser finalizado. Ao informar uma opção inválida, exibir uma
		 * mensagem de erro (opção inválida) ao usuário.
		 * 
		 * Caso a opção escolhida seja a 1: o algoritmo deve solicitar ao usuário por um
		 * valor a ser investido e pela quantia de anos de investimento. Sabe-se que
		 * existe um lucro de 15% por ano investido. Apresente ao usuário o valor do
		 * saldo após o fim do investimento. Caso a opção escolhida seja a 2: solicite
		 * um número ao usuário e informe se este número é primo ou não. Caso a opção
		 * escolhida seja a 3: o algoritmo deve solicitar ao usuário por dois números,
		 * representando o limite inferior e o limite superior, respectivamente. Todos
		 * os números que são múltiplos de 3 entre estes limites devem ser exibidos na
		 * tela. Caso a opção escolhida seja a 4: o algoritmo deve solicitar um número
		 * ao usuário e informar o fatorial deste número (exemplo: 5! = 5 * 4 * 3 * 2 *
		 * 1 = 120)
		 */

		int Op = 0;
		while (Op != 5) {
			System.out.println("MENU DE OPÇÕES:\r\n" + "1.Calcular lucro \r\n" + "2.Primo \r\n"
					+ "3.Múltiplos de 3 \r\n" + "4.Fatorial \r\n" + "5.Sair \r\n" + "OPÇÃO:");
			Op = tec.nextInt();
			if (Op == 1) {
				System.out.println("Qual o valor a ser investido? ");
				double investimento = tec.nextInt();
				System.out.println("Por quantos anos?");
				int anos = tec.nextInt();
				double vlr = investimento * anos;
				double porcen = 0.15 * anos;
				double total = vlr + vlr * porcen;
				System.out.println("valor do saldo após o fim do investimento: " + total);

			}
			if (Op == 2) {
				int div = 0;
				System.out.println("Digite o número");
				int num = tec.nextInt();
				
				
				for (int x = 1; x <= num; x++) {
					if (num % x == 0) {
						div++;
					}
					
					if (div == 2) {
						System.out.println("é primo");

					} 
					
					else {
						System.out.println("Não é primo");
					}
				}
				
			}
			if(Op == 4) {
				System.out.println("Digite o número: ");
				int num = tec.nextInt();
				int fato = 1;
				for(int x = num; x >= 1; x--) {
					fato = fato * x;
				}
				System.out.println("O fatorial de " + num + " é " + fato);
				
			}
		}
	}
	}

