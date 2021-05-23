import java.util.Locale;
import java.util.Scanner;

import entities.banco;

public class contadobanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		banco bank;

		System.out.print("Enter Account number: ");
		int accnumber = sc.nextInt();
		System.out.print("Enter Account holder: ");
		String name = sc.next();
		System.out.print("Crie uma senha para acessar a conta: ");
		int senha = sc.nextInt();
		
		
			System.out.print("Digite a senha que você criou para entrar: ");
			int check = sc.nextInt();
		 while (check != senha) {
			System.out.println("Senha inválida ;D");
			check = sc.nextInt();
		}
		
		System.out.println("========Acesso permitido, Bem vindo========");
		
		System.out.print("Quer fazer seu primeiro deposito (y/n)? ");


		char responde = sc.next().charAt(0);
		
		if (responde == 'y') {
			System.out.print("Qual o valor inicial de depósito?: ");
			double inicialDeposit = sc.nextDouble();
			bank = new banco(name, accnumber, inicialDeposit);
		} 
		else {
			System.out.println("Você escolheu nao fazer o deposito inicial");
			bank = new banco(name, accnumber);
		}
		
		System.out.printf("Account data: %n%s", bank);
		
		System.out.print("Deseja continuar (y/n)?: ");
		char repeat = sc.next().charAt(0);
		while (repeat == 'y') {
		System.out.println("Deseja depositar ou retirar ou ver o saldo? (d/r/s)?: ");		
		
		char resp = sc.next().charAt(0);
		
		if (resp == 'd') {
			System.out.print("Deposite um novo valor: ");
			double amount = sc.nextDouble();
			bank.deposit(amount);
			System.out.println("Updated account data: ");
			System.out.print(bank);
		}
		else if (resp == 'r') {
			System.out.print("Retire dinheiro da conta: ");
			double amount = sc.nextDouble();
			bank.withdraw(amount);
			System.out.println("Updated account data: ");
			System.out.print(bank);
		}
		else if (resp == 's') {
			System.out.printf("  O saldo da sua conta é:$%.2f%n", bank.getBalance());
		}
		
		System.out.print("Deseja continuar (y/n)?: ");
		 repeat = sc.next().charAt(0);
						

		}
		
		
		
		sc.close();
	}

}
