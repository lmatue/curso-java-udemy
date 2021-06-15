package Program;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        int a, b, c;
        
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
        sc.nextLine();
        
        c = a + b;
        
        System.out.printf("A soma entre %d + %d é %d ", a, b, c);
        
        
             
        sc.close();
	}

}
