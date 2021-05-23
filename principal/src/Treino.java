import java.util.Scanner;
import java.util.Locale;

public class Treino {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double R;
		double a, pi = 3.14159;
				
		R = sc.nextDouble();
		
		a = pi * R * R;
		
		System.out.printf("A= %.4f", a);
		
		sc.close();
		

	}

}
