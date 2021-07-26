package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Criar um objeto
		File file = new File("C:\\in.txt");//instatciare o file para pegar o endereço
		//o file vai encapsular todas as tarefas do arquivo ex: file.canWrite()
		Scanner sc = null;//deicxar um valor nulo inicial
		
		//Com o scanner pode ocorrer um exception para abrir o arquivo, logo usamos o try
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) { //hasNextLine() serve para testa se há uma linha no arquivo
				System.out.println(sc.nextLine());
			}
		}
		
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		//o finally é para finalizar o program indepedentemente do try!
		finally {
			if(sc != null) {
				sc.close();
			}
			
		}
	}

}
