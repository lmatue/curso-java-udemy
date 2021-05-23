package entities;

public class Banco_Exerc24 {
	
	private String name; 
	private int account;
	private double balance;
	
	public Banco_Exerc24 (String name, int account, double inicialDeposit) {
		this.name = name;
		this.account = account;
		deposit(inicialDeposit);
	}
	
	public Banco_Exerc24 (String name, int account) {
		this.name = name;
		this.account = account;
	}
	
	public void deposit (double amount) {
		this.balance += amount;
	}
	
	public void withdraw (double amount) {
		this.balance -= amount + 5.0;
	}
	
	public int getAccount() {
		return account;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}


	public String toString() {
		return "======Account number:" + account + String.format("%n======Name:%s%n", name) + String.format("======Balance: $%.2f%n    ", balance);
	}

}
