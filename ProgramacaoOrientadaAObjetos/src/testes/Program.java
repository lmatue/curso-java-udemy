package testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;
import entities_2.Client;
import entities_2.Order;
import entities_2.OrderItem;
import entities_2.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		
		Client client = new Client(name, email, birthDate);
		
		
		System.out.println("Enter order Data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n =sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(it);
		
		}
		
		System.out.println();
		System.out.println(order);
		
	
		
		
		sc.close();
	}

}
