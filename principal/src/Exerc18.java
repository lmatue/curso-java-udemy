import java.util.Scanner;


public class Exerc18 {

	public static void main(String[] args) {
		
		/*Teste de oop*/
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int high = max(a, b, c);

		showResult(high);
		sc.close();
		
	}
	
	public static int max(int x, int y, int z) {
		
		int maior;
		
		if (x > y && x > z) {
			maior = x;
		}
		else if (y > z) {
			maior = y;
		}
		else {
			maior = z;
		}
		
		return maior;
	}
		
	
		
	public static void showResult (int valor) {
		
		System.out.println("Maior valor: " + valor);
	}

}
