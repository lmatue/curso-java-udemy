import java.util.Scanner;

public class Treino4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		
		double total;
		
		if (cod == 1) {
			     total = quant * 4.0;
		}
		else if (cod == 2) {
			     total = quant * 4.50;
		}
		else if (cod == 3) {
			     total = quant * 5.0;
		}
		else if (cod == 4) {
			     total = quant * 2.0;
		}
		else {
			     total = quant * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f", total);
	
			
		sc.close();

	}

}
