import java.util.Scanner;
import java.util.Locale;
public class Exerc7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/*Exercicio de adi��o de taxa de operadora caso ultrapasse 100 minutos (2 reais de taxa pra cada minuto ultrapassado)*/
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
			System.out.println("O senhor excedeu os 100 minutos, ser� adicionado taxa");
		}
		
		System.out.printf("Valor a pagar: R$ %.2f ", conta);
		
		sc.close();

	}

}
