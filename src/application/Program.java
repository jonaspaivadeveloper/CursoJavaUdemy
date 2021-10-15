package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1900.0);
		Product p3 = new Product("Tablet", 91100.0);
		
		stock.put(p1, 1000.0);
		stock.put(p2, 132000.0);
		stock.put(p3, 13000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Constains 'ps' key: " + stock.containsKey(ps));
	}
}
