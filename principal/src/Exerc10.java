import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		switch (n) {
		case 1: 
			System.out.println("Bom dia");
			break;
		case 2: 
			System.out.println("Boa tarde");                // TESTE DE SWITCH CASE ////////////
			break;
		case 3:
			System.out.println("Boa noite");
			break;
		case 4: 
			System.out.println("Opa bao");
			break;
			default:
				System.out.println("Vc n escreveu nenhum numero");
		}

		sc.close();

	}

}
