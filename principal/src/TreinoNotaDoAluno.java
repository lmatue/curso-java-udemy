import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class TreinoNotaDoAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		estudante.aluno = sc.next();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", estudante.notaFinal());
		
		if (estudante.notaFinal() < 60.0) {
			System.out.println("VOCE FALHOU SEU COCO");
			System.out.printf("FALTOU SÓ %.2f pontos burro ", estudante.falhou());
		}
		
		else {
			System.out.println("Paraben ai, passou");
		}
		
		sc.close();
		
		

	}

}
