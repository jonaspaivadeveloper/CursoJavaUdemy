package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\in.txt";
		FileReader fr = null;//nulo s� para d� um valor a vari�vel
		BufferedReader br = null;
		
		//para ler o arquivo
		try {
			fr = new FileReader(path);//instanciou filereader com path
			br = new BufferedReader(fr);//desse jeito, torna a leitura mais r�pida
			
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
		
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
