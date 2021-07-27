package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Bloco try-with-resources
//É um bloco try que declara um pu mais rexursos, e garante que 
//esses recursos serão fechados ao final do bloco

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\in.txt";
		
		//para ler o arquivo
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			//manda uma linha do arquivo
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}	
	}
}
