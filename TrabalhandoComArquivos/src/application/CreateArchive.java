package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateArchive {

	public static void main(String[] args) {
		/*Criação de um arquivo txt em uma pasta local*/
		
		
		
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "C:\\Workspace\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
				

	}

}
