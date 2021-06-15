package Program;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exerc_Student {

	public static void main(String[] args) {
		/*Teste OOP. Digitar 3 notas de um aluno, se a nota total for menor que 60 mostrar na tela
		 que o aluno nao passou e os pontos que faltou, se a nota for maior ou igual a 60 então mostrar 
		 a mensagem que o aluno passou.*/
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		
		estudante.aluno = sc.next();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", estudante.notaFinal());
		
		if (estudante.notaFinal() < 60.0) {
			System.out.println("VOCE NAO PASSOU!");
			System.out.printf("faltou %.2f pontos para passar", estudante.falhou());
		}
		
		else {
			System.out.println("Parabens, passou");
		}
		
		sc.close();
		
		

	}

}
