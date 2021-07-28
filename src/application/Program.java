package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		//criando um vetor de string
		//new serve para instanciar o vetor de string
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};
		
		//criar o arquivo e gravar ele
		//e informar o caminho do arquivo
		String path = "C:\\Users\\jonas\\OneDrive\\Área de Trabalho\\out.txt";
		
		//fazer o try with resource
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			//fazer uma lógica para gravar as linhas
			for(String line : lines) {
				bw.write(line);
				bw.newLine();//para quebrar a linha pois o write não há quebra de linha
				
			}
		}
		catch(IOException e) {
			e.printStackTrace(); 	 	
		}
	}
}
