package Program;
import java.util.Scanner;
import java.util.Locale;

public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos*/

		double R;
		double a, pi = 3.14159;                   
				
		R = sc.nextDouble();
		
		a = pi * R * R;
		
		System.out.printf("A= %.4f", a);
		
		sc.close();
		

	}

}
