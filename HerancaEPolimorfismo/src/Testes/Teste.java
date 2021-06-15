package Testes;

import Entities.Account;
import Entities.SavingsAccount;

public class Teste {

	public static void main(String[] args) {
		
		Account acc = new Account(1000, "omatue", 1000.0);
		
		acc.withdraw(50.0);
		
		System.out.println(acc.getBalance());
		
		Account acc2 = new SavingsAccount(1001, "tue", 1000.0, 0.01);
		
		acc2.withdraw(50.0);
		   
		System.out.println(acc2.getBalance());
		
		

	}

}
