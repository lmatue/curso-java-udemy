package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Exerc {

	public static void main(String[] args) {

		/* 
		 *            ***Exercicio usando tratamento de exce��o***
		 *            
		 * Fazer um programa para ler os dados de uma conta banc�ria e depois realizar
		 * um saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode
		 * ocorrer ou se n�o houver saldo na conta, ou se o valor do saque for superior
		 * ao limite de saque da conta.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Inform the account data: ");
		System.out.print("Number of account: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Balance initial: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Inform the quantity of withdraw: ");
		double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
