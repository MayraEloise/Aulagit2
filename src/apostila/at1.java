package apostila;
import java.util.*;
public class at1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		/*Exercício 07: Implemente um algoritmo que permaneça exibindo a tela um 
		 * menu de  opções com as seguintes 
características: 
MENU DE OPÇÕES: 
Cadastrar 
Emitir Relatórios 
Sair 
OPÇÃO: ___ 
O usuário deverá digitar uma opção. Após digitar uma opção, o sistema deverá 
exibir novamente o menu na tela 
do usuário e solicitar novamente por uma opção. Finalize o algoritmo apenas 
quando o usuário digitar a opção 3.
		 
		 */
		int Op = 0;
		while(Op != 3){
			System.out.println("MENU DE OPÇÕES: \r\n"
					+ "1.Cadastrar \r\n"
					+ "2.Emitir Relatórios \r\n"
					+ "3.Sair \r\n"
					+ "OPÇÃO: ");
			Op = tec.nextInt();
			
		}
		System.out.println("Você escolheu sair!!");

	}

}
