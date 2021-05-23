package entities;

public class Funcionario_Exerc22 {
	public String nome;
	public double salariomax;
	public double taxa;
	
	public double netSalary() {
		return salariomax - taxa;
	}
	
	public void increaseSalary(double percentage) {
		salariomax += salariomax * percentage / 100.0;
	}
	
	public String toString() {
		
		return nome + ", $ " + String.format("%.2f", netSalary());
	}
	

}
