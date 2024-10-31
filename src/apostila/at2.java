package apostila;
import  java.util.*;
public class at2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		/*
Exercício 08: Escreva um algoritmo que exiba o seguinte menu de opções na tela 
do computador do usuário: 
MENU DE OPÇÕES: 
Somar 
Potência 
Sair 
OPÇÃO: ___ 
O algoritmo deve exibir o menu de opções e solicitar por uma resposta do usuário.
 Se o usuário informar a opção 
1, o algoritmo deve solicitar por dois números e apresentar a soma destes dois 
números. Se o usuário informar a 
opção 2, o algoritmo deve solicitar pela base e pelo expoente e exibir na tela o 
valor da base elevado ao valor 
expoente. Se o usuário digitar o valor 3, a repetição deve ser finalizada. 
Qualquer número diferente das opções, 
uma mensagem de “Opção inválida, tente novamente” deve ser exibida. 
O algoritmo deve finalizar a repetição apenas quando o usuário informar a opção 3.
		 
		 */
		int Esco = 0;
		while(Esco != 3) {
			System.out.println("MENU DE OPÇÕES: \r\n"
					+ "1.Somar \r\n"
					+ "2.Potência \r\n"
					+ "3.Sair ");
			Esco = tec.nextInt();
			if(Esco == 1) {
				System.out.println("Digite o 1º número: ");
				int n1 = tec.nextInt();
				System.out.println("Digite o 2º número: ");
				int n2 = tec.nextInt();
				
		
			}
				
			
			
		}
	}

}
