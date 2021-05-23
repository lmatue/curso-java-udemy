import java.util.Scanner;

import entities.Vect2;

public class VectTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vect2[] vect = new Vect2[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Vect2(name, email);
			}
		
		System.out.println("Busy rooms: ");
		
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		
		sc.close();

	}

}
