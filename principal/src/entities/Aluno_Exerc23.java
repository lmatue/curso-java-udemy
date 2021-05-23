package entities;

public class Aluno_Exerc23 {
	
	public String aluno;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double falhou() {
		
		if (notaFinal() < 60.0) {
			
			return 60.0 - notaFinal();
		}
		else {
			return 0.0;
		}
	}

}
