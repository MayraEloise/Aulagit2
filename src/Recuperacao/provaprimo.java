package Recuperacao;

import java.util.*;

public class provaprimo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		/*
		 * Desenvolva um algoritmo que permita ao usuário definir um intervalo de
		 * números, e identifique e exiba todos os números primos dentro desse
		 * intervalo.
		 * 
		 * Um número primo é um número natural maior que 1 que só pode ser dividido por
		 * 1 e por ele mesmo, ou seja, ele possui exatamente dois divisores.
		 * 
		 * Requisitos: O programa deve solicitar que o usuário insira dois números
		 * inteiros: o valor inicial e o valor final do intervalo. O programa deve
		 * verificar todos os números dentro do intervalo (incluindo os limites) e
		 * identificar quais são primos. Exiba todos os números primos encontrados no
		 * intervalo. Ao final, o programa deve também mostrar o total de números primos
		 * encontrados no intervalo.
		 * 
		 */
		System.out.println("Digite o número inicial: ");
		int ini = tec.nextInt();
		System.out.println("Digite o número máximo: ");
		int max = tec.nextInt();
		int primos =  0;
		if(ini == 1|| max==1) {
			System.out.println("1 é primo");
			primos++;
		}
		for(int x = ini; x <= max; x++) {
			int div = 0;
			for(int a = 1; a <= x; a++) {
				if(x % a == 0) {
					div++;
				}
			}
			if(div == 2) {
				System.out.println(x + " é primo");
				primos ++;
			}
		}
		System.out.println(primos + " números primos");
	}
}