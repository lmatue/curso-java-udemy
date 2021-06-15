package Program;
import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Exerc_Retangle {
	/* Treino OOP. Area, perimetro e diagonal de um retangulo. */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangle retangle = new Retangle();

		System.out.println("Enter Rectangle width and height:");
		retangle.width = sc.nextDouble();
		retangle.height = sc.nextDouble();
		//////
		//////
		System.out.printf("Area = %.2f%n", retangle.area());
		System.out.printf("Perimetro = %.2f%n", retangle.perimetro());
		System.out.printf("Diagonal = %.2f%n ", retangle.diagonal());

		sc.close();
	}

}
