package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		//craiar uma variável File 
		File path = new File(strPath);
		
		//pegar todas as pastas
		File[] folders =  path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//agora pegar os txt
		File[] files = path.listFiles(File::isFile); 
		for(File file : files) {
			System.out.println(file);
		}
		
		//criar uma subpasta
		boolean success = new File(strPath + "\\Jonas").mkdir();
		System.out.println("Directory created successfully: " + success);
	}
}
