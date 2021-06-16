package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		/*Bloco finally = Ser executado independente de acontecer ou nao uma execeção*/

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} 
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally End");
		}
	}
}
