package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new  ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 100.00));
		list.add(new Product("Hd CASE", 99.00));
		
		double factor = 1.1;
		
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		
		list.forEach(cons);
		
		list.forEach(System.out :: println);
		
	}
}
