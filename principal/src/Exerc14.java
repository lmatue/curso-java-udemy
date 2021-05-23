import java.util.Scanner;


public class Exerc14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*Exercio usando "for" estrutura repetitiva*/
		
		
		int x = 4;
		int y = 0;
		
		for (int i = 1; i < x; i++) {      // for (Inicio; Condição; implemento)
			
			System.out.print(i + "|");
			
			y = y + 5;
			
			System.out.println(y);
					
		}
		
		sc.close();
		
	}

}
