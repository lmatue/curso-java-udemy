import java.util.Scanner;
import java.util.Locale;
public class Treino8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
			System.out.println("O senhor excedeu os 100 minutos, será adicionado taxa");
		}
		
		System.out.printf("Valor a pagar: R$ %.2f ", conta);
		
		sc.close();

	}

}
