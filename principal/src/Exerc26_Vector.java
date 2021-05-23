import java.util.Locale;
import java.util.Scanner;

import entities.Vector_Exerc26;

public class Exerc26_Vector {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um numero inteiro N e os dados (nome e preço) de N
		 * produtos. Armazene os N produtos em um vetor. em seguida, mostrar o preço
		 * médio dos produtos.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Vector_Exerc26[] vect = new Vector_Exerc26[n];
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Vector_Exerc26(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		sc.close();

	}

}
