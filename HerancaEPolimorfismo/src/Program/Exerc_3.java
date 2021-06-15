package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

public class Exerc_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)?: ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures =sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			
			else {
				
				System.out.print("Number of Employees: ");
				int employee = sc.nextInt();
				
				list.add(new Company(name, anualIncome, employee));				
			}
			
			System.out.print("------------------------------");
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0;
		
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
			
			sum += tp.tax();
		}
		
		System.out.printf("TOTAL TAXES: %.2f", sum);
	
		
      sc.close();
	}

}
