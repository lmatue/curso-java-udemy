package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.enums.Color;

public class Exerc_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c): ");
			char resp = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if (resp == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
			
			}
		System.out.println();
		System.out.print("SHAPE AREAS: ");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
		
	}
}
