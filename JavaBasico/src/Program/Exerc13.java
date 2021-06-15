package Program;
import java.util.Scanner;
import java.util.Locale;

public class Exerc13 {

	public static void main(String[] args) {
		
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y !=0) {                   /*Mais testes de While pra reforçar estudo*/
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			
			else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			
			x = sc.nextInt();
		    y = sc.nextInt();
			
		}
		
		System.out.println("...");
		
		sc.close();
			

	}

}
