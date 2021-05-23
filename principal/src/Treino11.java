import java.util.Scanner;
import java.util.Locale;

public class Treino11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida ;D");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido, seja bem vindo mestre c:");
		
		sc.close();
			

	}

}
