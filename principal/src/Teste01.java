import java.util.Locale;
import java.util.Scanner;
import entities.TesteDoTeste;




public class Teste01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro numero: ");
		double soma1 = sc.nextDouble();
		System.out.print("Segundo numero: ");
		double soma2 = sc.nextDouble();
		
		double somadetudo = TesteDoTeste.soma(soma1, soma2);
		
		System.out.printf("O numero %.1f multiplicado pelo numero %.1f, o resultado é %.1f", soma1, soma2, somadetudo);
		
		
		
		sc.close();

	}

}
