package Program;
import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
*/
		
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		
		double total;
		
		if (cod == 1) {
			     total = quant * 4.0;
		}
		else if (cod == 2) {
			     total = quant * 4.50;
		}
		else if (cod == 3) {
			     total = quant * 5.0;
		}
		else if (cod == 4) {
			     total = quant * 2.0;
		}
		else {
			     total = quant * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f", total);
	
			
		sc.close();

	}

}
