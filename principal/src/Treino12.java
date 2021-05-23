import java.util.Scanner;
import java.util.Locale;

public class Treino12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y !=0) {
			
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
