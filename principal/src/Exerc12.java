import java.util.Scanner;
import java.util.Locale;

public class Exerc12 {

	public static void main(String[] args) {
		
		/*Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inv�lida ;D");          /*Teste de acesso usando While*/
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido, seja bem vindo mestre c:");
		
		sc.close();
			

	}

}
