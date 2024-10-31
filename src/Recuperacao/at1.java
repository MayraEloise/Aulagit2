package Recuperacao;

import java.util.*;

public class at1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Random ale = new Random();
		/*
		 * Implemente um algoritmo que consiga exibir o seguinte menu de opções ao
		 * usuário:
		 * 
		 * MENU DE OPÇÕES: 1. Somar dois números 2. Exibir a tabuada de um número 3.
		 * Maior número 4. Sair OPÇÃO: __
		 * 
		 * 
		 * O algoritmo deve permanecer exibindo o menu e solicitando ao usuário pelo
		 * valor da opção, até que o usuário informe a opção 4. Sair. Neste caso, o
		 * algoritmo deve ser finalizado. Ao informar uma opção inválida, exibir uma
		 * mensagem de erro (opção inválida) ao usuário.
		 * 
		 * Caso a opção escolhida seja a 1: o algoritmo deve solicitar ao usuário por
		 * dois números ponto-flutuantes e apresentar na tela a soma destes dois
		 * valores. Caso a opção escolhida seja a 2: o algoritmo deve solicitar ao
		 * usuário por um número inteiro e mostrar a tabuada deste valor informado
		 * (multiplicações entre 0 e 10, utilizando laço de repetição). Caso a opção
		 * escolhida seja a 3: o algoritmo deve sortear dois números entre 10 e 100
		 * (números incluídos no sorteio), mostrar na tela os números sorteados, e
		 * mostrar uma mensagem indicando qual destes dois valores é o maior.
		 * 
		 * 
		 */
		int Op = 0;
		while(Op != 4) {
			System.out.println("MENU DE OPÇÕES: \r\n"
					+ "1. Somar dois números \r\n"
					+ "2. Exibir a tabuada de um número \r\n"
					+ "3. Maior número \r\n"
					+ "4. Sair \r\n"
					+ "OPÇÃO:");
			Op = tec.nextInt();
			if(Op==1) {
				System.out.println("Digite o 1º número: ");
				double num1 = tec.nextDouble();
				System.out.println("Digite o 2º número: ");
				double num2 = tec.nextDouble();
				double soma = num1 + num2;
				System.out.println("A soma é: " + soma);
				
			}
			if(Op == 2) {
				System.out.println("Digite o número da tabuada: ");
				int num = tec.nextInt();
				System.out.println("TABUADA DO " + num);
				for(int x = 1; x<=10; x++) {
					int mult = num * x;
					System.out.println(num + "X" + x + " = " + mult);
				}
				
			}
			
			if(Op == 3) {
				int num1 = ale.nextInt(100)+10;
				int num2 = ale.nextInt(100)+10;
				System.out.println("Números sorteados: " + num1 + ", " + num2);
				if(num1 > num2) {
					System.out.println("Maior número: " + num1);
				}
				else {
					System.out.println("Maior número: " + num2);
				}
				
			}
			if(Op<1 || Op>4) {
				System.out.println("OPÇÃO INVÁLIDA!!!");
			}
			
		}
		System.out.println("Você escolheu sair!!");
	}

}
