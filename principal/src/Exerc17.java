import java.util.Scanner;


public class Exerc17 {
	
	/*Ler um n�mero inteiro N e calcular todos os seus divisores.*/


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();				
			
			for (int i=1; i<=n; i++) {     //Divisores
				if (n % i == 0) {
					System.out.println(i);
				}
			}
		
		sc.close();
		
	}

}
