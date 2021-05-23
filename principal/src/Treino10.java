import java.util.Scanner;

public class Treino10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
		    x = sc.nextInt();              // TESTE DE WHILE
			
		}
		
		System.out.println(soma);
		sc.close();

	}

}
