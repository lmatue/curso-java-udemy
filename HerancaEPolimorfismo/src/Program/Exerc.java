package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Exerc {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'c') {			
				list.add(new Product(name, price));
			}
			
			else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
					
				list.add(new UsedProduct(name, price, date));
			}
			
			else if (ch == 'i') {
				System.out.print("Customs fee: ");
				double csf = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, csf));
			}
			
		}
		
		for (Product p : list) {
			System.out.println("----------------------");
			System.out.println(p.priceTag());
		}

		
		sc.close();
	}

}
