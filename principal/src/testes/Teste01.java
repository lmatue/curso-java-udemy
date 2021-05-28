package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

//Testando os métodos List e Vector

public class Teste01 {

	public static void main(String[] args) {
		
		
		String[] vect = new String[] {"Fernando", "vitor", "Alek"};
		for (int i  =  0; i < vect.length; i++) {
		System.out.println(vect[i]);
		}
		
		
		for (String obj : vect) {
		System.out.println(obj);
		}
		
		System.out.println("-------------------------------");
		
		List<String> list = new ArrayList<>();
		
		list.add("Salve");
		list.add("Bom dia");
		list.add("Boa noite");
		list.add("Buenas tarde");
		list.add("Suco de fruta");
		list.add("Banana");
		list.add(1, "Drake, cade a porta?");
		
		
		for (String x : list) {
			
			System.out.println(x);
			
		}
		
		System.out.println("---------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		
		for (String obj : result) {
			System.out.println(obj);
		}
		System.out.println("----------------------");
		String names = list.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
		

			System.out.println(names);
		
		
		System.out.println("---------------");
		System.out.println(list.get(3));
		
		System.out.println("===========================");
		
		Vector<Integer> vec = new Vector<>();
		
		vec.add(20);
		vec.add(9);
		vec.add(5);
		vec.add(4);
		vec.add(1);
		vec.add(7);
		
		for (int v : vec) {
			System.out.println(v);
			
		}
		
		System.out.println(vec.get(2));
		
		
		

	}

}

