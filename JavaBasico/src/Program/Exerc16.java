package Program;
import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) { 
		/*Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				
			    System.out.println("Divis�o impossivel");			    	
			    }
			
			else {
			    double div = (double) a / b;
				System.out.printf("%.1f%n", div);
			    
			}
		}
		
		
		sc.close();
		
	}

}

//Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
