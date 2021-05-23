import java.util.Scanner;

import entities.Produto_Exerc20;

import java.util.Locale;

public class Exerc20_Produto {

	public static void main(String[] args) {
		
		/*Teste de OOP, Nome de um produto, preço, quantidade em stock, e adição e remoção de stock*/
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Produto_Exerc20 product = new Produto_Exerc20(name, price, quantity);
				
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}

}
