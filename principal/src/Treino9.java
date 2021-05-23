import java.util.Scanner;

public class Treino9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		switch (n) {
		case 1: 
			System.out.println("Ratomanucu");
			break;
		case 2: 
			System.out.println("Vagabundo");                // TESTE DE SWITCH CASE ////////////
			break;
		case 3:
			System.out.println("olha ali sua mae");
			break;
		case 4: 
			System.out.println("vi sua prima ontem");
			break;
			default:
				System.out.println("vc n escreveu nenhum numero fdp");
		}

		sc.close();

	}

}
