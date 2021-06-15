package Testes;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Teste2 {

	public static void main(String[] args) {
		

		
		// UPCASTING
		
		
	
		Account acc3 = new SavingsAccount(1010, "xico", 600.0, 0.01);
		
		
		// DOWNCASTING
		
		//BusinessAccount acc4 = acc2; //Nao é natural converter uma SuperClass para SubClass,

		
		
		//BusinessAccount acc6 = (BusinessAccount)acc3; //Erro de conversão
		
		
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(500.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
				
	}

}
